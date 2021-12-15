package com.glacier.evo.app.sys.convert;

import com.glacier.evo.app.sys.dto.post.PostDto;
import com.glacier.evo.domain.sys.model.Post;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

/**
 * date 2021-05-06 16:39
 * 岗位类型转换
 *
 * @author glacier
 * @version 1.0
 */
@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PostConvert {
    
    /**
     * 转换
     *
     * @param post
     * @return
     */
    PostDto toPostDto(Post post);
    
    /**
     * 转换
     *
     * @param postList
     * @return
     */
    List<PostDto> toPostDto(List<Post> postList);
    
    /**
     * 转换
     *
     * @param postDto
     * @return
     */
    Post map(PostDto postDto);
}
