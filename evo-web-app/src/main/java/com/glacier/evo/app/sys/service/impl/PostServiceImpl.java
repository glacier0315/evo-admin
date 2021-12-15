package com.glacier.evo.app.sys.service.impl;


import com.glacier.component.dto.CodeQuery;
import com.glacier.component.dto.page.PageRequest;
import com.glacier.component.dto.page.PageResponse;
import com.glacier.evo.app.common.service.PageableService;
import com.glacier.evo.app.sys.convert.PostConvert;
import com.glacier.evo.app.sys.dto.post.PostDto;
import com.glacier.evo.app.sys.service.PostService;
import com.glacier.evo.domain.sys.model.Post;
import com.glacier.evo.domain.sys.model.dto.PostQuery;
import com.glacier.evo.sys.mapper.PostMapper;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 岗位业务层
 *
 * @author glacier
 * @version 1.0
 * date 2020-09-05 21:53
 */
@Transactional(readOnly = true)
@Service("postService")
public class PostServiceImpl implements PostService, PageableService {
	private static final Logger log = LoggerFactory.getLogger(PostServiceImpl.class);
	@Autowired
	private PostConvert postConvert;
	@Autowired
	private PostMapper postMapper;
	
	@Override
	public PageResponse<PostDto> findPage(PageRequest<PostQuery> pageRequest) {
		return findPage(pageRequest, (params ->
				this.postConvert.toPostDto(
						this.postMapper.selectList(params))));
	}
	
	@Override
	public List<PostDto> findAllList() {
		return this.postConvert.toPostDto(
				this.postMapper.selectAll());
	}
	
	@Override
	public boolean checkCode(PostDto postDto) {
		if (postDto != null
				&& StringUtils.isNotEmpty(postDto.getCode())) {
			return this.postMapper.checkCodeExist(new CodeQuery(postDto.getId(), postDto.getCode())) > 0;
		}
		return false;
	}
	
	@Transactional(rollbackFor = {})
	@Override
	public int save(PostDto postDto) {
		Post post = this.postConvert.map(postDto);
		if (!post.isNewRecord()) {
			post.preUpdate();
			return this.postMapper.updateByPrimaryKey(post);
		}
		post.preInsert();
		return this.postMapper.insert(post);
	}
	
	@Transactional(rollbackFor = {})
	@Override
	public int delete(String id) {
		if (id == null || id.trim().isEmpty()) {
			return 0;
		}
		return this.postMapper.deleteByPrimaryKey(id);
	}
}
