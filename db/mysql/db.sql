CREATE DATABASE evo_admin CHARACTER SET 'utf8' COLLATE 'utf8_general_ci';

use evo_admin;

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS sys_user;
CREATE TABLE sys_user  (
                           id varchar(64) NOT NULL COMMENT '主键',
                           username varchar(50)  COMMENT '用户名',
                           password varchar(255)  COMMENT '密码',
                           nickname varchar(50)  COMMENT '昵称',
                           id_card varchar(20)  COMMENT '身份证号',
                           birthday date  COMMENT '生日',
                           sex int(4) COMMENT '性别',
                           email varchar(100)  COMMENT '邮箱',
                           mobile varchar(20)  COMMENT '手机号',
                           post_id varchar(64)  COMMENT '岗位',
                           dept_id varchar(64)  COMMENT '单位',
                           dept_name varchar(64)  COMMENT '单位',
                           status varchar(4)  COMMENT '状态',
                           avatar varchar(500)  COMMENT '头像',
                           create_by varchar(64)  COMMENT '创建人',
                           create_date timestamp DEFAULT current_timestamp COMMENT '创建时间',
                           update_by varchar(64)  COMMENT '更新人',
                           update_date timestamp DEFAULT current_timestamp COMMENT '更新时间',
                           del_flag varchar(4) default '0'  COMMENT '删除标记',
                           PRIMARY KEY (id) USING BTREE,
                           INDEX sys_user_1(username) USING BTREE,
                           INDEX sys_user_2(id_card) USING BTREE,
                           INDEX sys_user_3(status) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO sys_user (id, username, password, nickname, id_card, birthday, sex, email, mobile, dept_id, dept_name, status, avatar, create_by, create_date, update_by, update_date, del_flag) VALUES ('1', 'admin', '$2a$10$RCvUyaqalDebEuYPVSOqCOlpRBO9hfslhp4SEN1dK/kJcc0FYY0aW', '超级管理员', '421121198604137015', '1990-03-04', 1, '14151@126.com', '15926081406', '4c963d38ae25416ea3c1f141656b8f78', '湖北荆州', '1', null, null, '2019-11-07 17:01:42', '1', '2020-09-03 20:36:24', '0');
INSERT INTO sys_user (id, username, password, nickname, id_card, birthday, sex, email, mobile, dept_id, dept_name, status, avatar, create_by, create_date, update_by, update_date, del_flag) VALUES ('3d908373717c4539ba02011e2bfc2398', 'ceshi2', '$2a$10$68/saBjPxR8aLuhTI7reR.OFj0pnIhx/CG/bopFsbCbEIp17I5Pe2', '测试22', '421121198604137016', '1990-06-02', 1, '321@126.com', '15970121345', 'ca06d9feadf143a7adb7977923e4e3cc', '湖北武汉', '1', null, null, '2020-08-08 05:26:38', '1', '2020-09-03 20:36:34', '0');
INSERT INTO sys_user (id, username, password, nickname, id_card, birthday, sex, email, mobile, dept_id, dept_name, status, avatar, create_by, create_date, update_by, update_date, del_flag) VALUES ('651c74980f0f40729b28d6bd9fe32c80', 'ceshi1', '$2a$10$aJ/mxyNZZe3AfYpykFA8G.ubIDfHboYMtJH/ejgkk3h4bUDs3Dvsy', '测试11', '421121198604137017', '1988-07-08', 1, '123@126.com', '15927021502', '4c963d38ae25416ea3c1f141656b8f78', '湖北荆州', '1', null, null, '2020-08-08 05:22:02', '1', '2020-08-27 10:26:04', '0');
INSERT INTO sys_user (id, username, password, nickname, id_card, birthday, sex, email, mobile, dept_id, dept_name, status, avatar, create_by, create_date, update_by, update_date, del_flag) VALUES ('c35d5b94aca547799fbe56ddd90bcfc4', 'ceshi', '$2a$10$RP6MGP8lFqKhh0.2/SroKepKV25y8u2XSjvD8dzRXBzwAZGZYSYl.', '普通用户', '421121198604137018', '1992-08-06', 2, '14151@126.com', '15926081406', '4c963d38ae25416ea3c1f141656b8f78', '湖北荆州', '1', null, null, '2020-06-25 07:45:59', '1', '2020-08-27 10:27:20', '0');

-- ----------------------------
-- Table structure for sys_menu
-- ----------------------------
DROP TABLE IF EXISTS sys_menu;
CREATE TABLE sys_menu  (
                           id          varchar(64) NOT NULL DEFAULT '1' COMMENT '主键',
                           name        varchar(200) COMMENT '名称',
                           path        varchar(255) COMMENT '端点路径',
                           component   varchar(255) COMMENT '组件',
                           icon        varchar(255) COMMENT '图标',
                           type        int(4)               DEFAULT 1 COMMENT '类型',
                           status      int(4)               DEFAULT 1 COMMENT '状态 1 正常  2 禁用',
                           visible     int(4)               DEFAULT 1 COMMENT '可行性 1 显示  2 隐藏',
                           is_frame    int(4)               DEFAULT 2 COMMENT '是否外链 1 是  2 否',
                           permission  varchar(255) COMMENT '权限',
                           parent_id   varchar(255) COMMENT '父级id',
                           grade       int(4) COMMENT '层级',
                           order_num   int(4) COMMENT '排序号',
                           create_by   varchar(64) COMMENT '创建人',
                           create_date timestamp            DEFAULT current_timestamp COMMENT '创建时间',
                           update_by   varchar(64) COMMENT '更新人',
                           update_date timestamp            DEFAULT current_timestamp COMMENT '更新时间',
                           del_flag    varchar(4)           default '0' COMMENT '删除标记',
                           PRIMARY KEY (id) USING BTREE,
                           INDEX sys_menu_1 (parent_id) USING BTREE,
                           INDEX sys_menu_2 (type) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '菜单表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_menu
-- ----------------------------
INSERT INTO sys_menu (id, name, path, component, icon, type, status, visible, is_frame, permission, parent_id, grade, order_num, create_by, create_date, update_by, update_date, del_flag) VALUES ('1', 'permission', '/permission', 'Layout', 'lock', 1, 1, 1, 2, null, null, null, 1, null, '2020-06-25 07:45:59', null, '2020-06-25 07:45:59', '0');
INSERT INTO sys_menu (id, name, path, component, icon, type, status, visible, is_frame, permission, parent_id, grade, order_num, create_by, create_date, update_by, update_date, del_flag) VALUES ('5', '系统设置', '/sys', '', 'el-icon-setting', 1, 1, 1, 2, null, null, null, 5, null, '2020-06-27 03:29:29', null, '2020-06-27 03:29:29', '0');
INSERT INTO sys_menu (id, name, path, component, icon, type, status, visible, is_frame, permission, parent_id, grade, order_num, create_by, create_date, update_by, update_date, del_flag) VALUES ('9aa94a46ef6f4ae9a48d501871ce4fbf', '代码生成', '/gen', null, 'component', 1, 1, 1, 2, null, null, null, 6, '1', '2020-09-20 17:44:11', '1', '2020-09-20 17:48:11', '0');
INSERT INTO sys_menu (id, name, path, component, icon, type, status, visible, is_frame, permission, parent_id, grade, order_num, create_by, create_date, update_by, update_date, del_flag) VALUES ('0b2c28fb18bc213a2ea7143cbf724702', 'icon', '/icon', 'Layout', null, 1, 1, 1, 2, null, null, null, 11, null, '2020-07-04 02:37:46', null, '2020-07-04 02:37:46', '0');
INSERT INTO sys_menu (id, name, path, component, icon, type, status, visible, is_frame, permission, parent_id, grade, order_num, create_by, create_date, update_by, update_date, del_flag) VALUES ('be14507626f7f301fbfc21ddbd8e6380', 'pdf', '/pdf', null, null, 1, 1, 1, 2, null, null, null, 13, null, '2020-07-04 03:04:29', null, '2020-07-04 03:04:29', '0');
INSERT INTO sys_menu (id, name, path, component, icon, type, status, visible, is_frame, permission, parent_id, grade, order_num, create_by, create_date, update_by, update_date, del_flag) VALUES ('a38df56dd7f59f030a0bc449fcc97d57', 'icons', '/icon/index', 'icons', 'icon', 2, 1, 1, 2, null, '0b2c28fb18bc213a2ea7143cbf724702', null, 12, null, '2020-07-04 02:38:52', null, '2020-07-04 02:38:52', '0');
INSERT INTO sys_menu (id, name, path, component, icon, type, status, visible, is_frame, permission, parent_id, grade, order_num, create_by, create_date, update_by, update_date, del_flag) VALUES ('2', 'PagePermission', '/permission/page', 'permission/page', null, 2, 1, 1, 2, null, '1', null, 2, null, '2020-06-25 07:45:59', null, '2020-06-25 07:45:59', '0');
INSERT INTO sys_menu (id, name, path, component, icon, type, status, visible, is_frame, permission, parent_id, grade, order_num, create_by, create_date, update_by, update_date, del_flag) VALUES ('3', 'directive', '/permission/directive', 'permission/directive', null, 2, 1, 1, 2, null, '1', null, 3, null, '2020-06-25 07:45:59', null, '2020-06-25 07:45:59', '0');
INSERT INTO sys_menu (id, name, path, component, icon, type, status, visible, is_frame, permission, parent_id, grade, order_num, create_by, create_date, update_by, update_date, del_flag) VALUES ('4', 'role', '/permission/role', 'permission/role', null, 2, 1, 1, 2, null, '1', null, 4, null, '2020-06-25 07:45:59', 'c35d5b94aca547799fbe56ddd90bcfc4', '2020-09-03 20:46:19', '0');
INSERT INTO sys_menu (id, name, path, component, icon, type, status, visible, is_frame, permission, parent_id, grade, order_num, create_by, create_date, update_by, update_date, del_flag) VALUES ('6', '用户管理', '/sys/user', 'sys/user', 'user', 2, 1, 1, 2, null, '5', null, 1, null, '2020-06-27 03:31:00', '1', '2020-09-06 09:36:50', '0');
INSERT INTO sys_menu (id, name, path, component, icon, type, status, visible, is_frame, permission, parent_id, grade, order_num, create_by, create_date, update_by, update_date, del_flag) VALUES ('4e70a707c3d24b29aefe737d6a61b5c9', '用户授权', '/sys/user/role', 'sys/user/role', null, 2, 1, 2, 2, null, '5', null, 2, '1', '2020-09-03 20:38:07', null, null, '0');
INSERT INTO sys_menu (id, name, path, component, icon, type, status, visible, is_frame, permission, parent_id, grade, order_num, create_by, create_date, update_by, update_date, del_flag) VALUES ('7', '角色管理', '/sys/role', 'sys/role', 'people', 2, 1, 1, 2, null, '5', null, 3, null, '2020-06-27 03:31:33', '1', '2020-09-06 09:36:57', '0');
INSERT INTO sys_menu (id, name, path, component, icon, type, status, visible, is_frame, permission, parent_id, grade, order_num, create_by, create_date, update_by, update_date, del_flag) VALUES ('d553d5090905465eb23cc5285c5f41ad', '角色授权', '/sys/role/user', 'sys/role/user', null, 2, 1, 2, 2, null, '5', null, 4, '1', '2020-09-03 20:39:03', null, null, '0');
INSERT INTO sys_menu (id, name, path, component, icon, type, status, visible, is_frame, permission, parent_id, grade, order_num, create_by, create_date, update_by, update_date, del_flag) VALUES ('8', '菜单管理', '/sys/menu', 'sys/menu', 'list', 2, 1, 1, 2, null, '5', null, 8, null, '2020-06-27 03:32:20', '1', '2020-09-06 09:47:19', '0');
INSERT INTO sys_menu (id, name, path, component, icon, type, status, visible, is_frame, permission, parent_id, grade, order_num, create_by, create_date, update_by, update_date, del_flag) VALUES ('9', '组织机构', '/sys/dept', 'sys/dept', 'tree', 2, 1, 1, 2, null, '5', null, 10, null, '2020-06-27 03:32:54', null, '2020-07-04 02:36:30', '0');
INSERT INTO sys_menu (id, name, path, component, icon, type, status, visible, is_frame, permission, parent_id, grade, order_num, create_by, create_date, update_by, update_date, del_flag) VALUES ('9ffee089c8c24638b5b7f646da498cb3', '岗位管理', '/sys/post', 'sys/post', 'user', 2, 1, 1, 2, null, '5', null, 11, '1', '2020-09-06 09:36:34', '1', '2020-09-06 09:39:20', '0');
INSERT INTO sys_menu (id, name, path, component, icon, type, status, visible, is_frame, permission, parent_id, grade, order_num, create_by, create_date, update_by, update_date, del_flag) VALUES ('6b12cf99f99f4860ab4f686e55bdc380', '数据源管理', '/gen/datasource', 'gen/datasource', 'list', 2, 1, 1, 2, null, '9aa94a46ef6f4ae9a48d501871ce4fbf', null, 1, '1', '2020-09-20 17:45:23', '1', '2020-09-20 17:48:18', '0');
INSERT INTO sys_menu (id, name, path, component, icon, type, status, visible, is_frame, permission, parent_id, grade, order_num, create_by, create_date, update_by, update_date, del_flag) VALUES ('1bca38c0d77841f6b39fe523b1607196', '表管理', '/gen/table', 'gen/table', 'list', 2, 1, 1, 2, null, '9aa94a46ef6f4ae9a48d501871ce4fbf', null, 2, '1', '2020-09-20 17:46:30', '1', '2020-09-20 17:48:21', '0');
INSERT INTO sys_menu (id, name, path, component, icon, type, status, visible, is_frame, permission, parent_id, grade, order_num, create_by, create_date, update_by, update_date, del_flag) VALUES ('54f41ef8740a67b56a122453d0323ded', 'pdf', '/pdf/index', 'pdf/index', 'pdf', 2, 1, 1, 2, null, 'be14507626f7f301fbfc21ddbd8e6380', null, 14, null, '2020-07-04 03:05:13', 'c35d5b94aca547799fbe56ddd90bcfc4', '2020-09-03 20:46:24', '0');

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS sys_role;
CREATE TABLE sys_role  (
                           id varchar(64) NOT NULL COMMENT '主键',
                           name varchar(200)  COMMENT '角色名',
                           code varchar(255)  COMMENT '角色编码',
                           status varchar(4) default '1'  COMMENT '状态',
                           data_scope varchar(4) default '6' COMMENT '数据权限 1 所有单位  2 所属一级单位及以下  3 所属二级单位及以下  4 所属单位部门及以下  5 自定义 6 自己',
                           description varchar(500)  COMMENT '说明',
                           create_by varchar(64)  COMMENT '创建人',
                           create_date timestamp DEFAULT current_timestamp  COMMENT '创建时间',
                           update_by varchar(64)  COMMENT '更新人',
                           update_date timestamp DEFAULT current_timestamp  COMMENT '更新时间',
                           del_flag varchar(4) default '0' COMMENT '删除标记',
                           PRIMARY KEY (id) USING BTREE,
                           INDEX sys_role_1(code) USING BTREE,
                           INDEX sys_role_2(status) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '角色表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_role
-- ----------------------------
INSERT INTO sys_role (id, name, code, status, data_scope, description, create_by, create_date, update_by, update_date, del_flag) VALUES ('1', '超级管理员', 'admin', '1', '1', null, null, '2020-06-25 07:45:59', '1', '2020-09-03 20:40:19', '0');
INSERT INTO sys_role (id, name, code, status, data_scope, description, create_by, create_date, update_by, update_date, del_flag) VALUES ('d1ece8903278fe25e8be2804fd755025', '普通用户', 'user', '1', '2', null, null, '2020-07-04 01:49:03', '1', '2020-09-03 20:40:55', '0');

-- ----------------------------
-- Table structure for sys_dept
-- ----------------------------
DROP TABLE IF EXISTS sys_dept;
CREATE TABLE sys_dept
(
    id          varchar(64) NOT NULL COMMENT '主键',
    name        varchar(200) COMMENT '名称',
    code        varchar(255) COMMENT '编码',
    type        int(4) COMMENT '类型',
    status      int(4) COMMENT '状态',
    order_num   int(4) COMMENT '排序号',
    grade       int(4) COMMENT '层级',
    parent_id   varchar(255) COMMENT '父级id',
    parent_name varchar(255) COMMENT '父级单位',
    parent_ids  varchar(2000) COMMENT '所有父级id,格式：,id1,id2,',
    create_by   varchar(64) COMMENT '创建人',
    create_date timestamp  DEFAULT current_timestamp COMMENT '创建时间',
    update_by   varchar(64) COMMENT '更新人',
    update_date timestamp  DEFAULT current_timestamp COMMENT '更新时间',
    del_flag    varchar(4) default '0' COMMENT '删除标记',
    PRIMARY KEY (id) USING BTREE,
    INDEX sys_dept_1 (parent_id) USING BTREE,
    INDEX sys_dept_2 (type) USING BTREE,
    INDEX sys_dept_3 (status) USING BTREE,
    INDEX sys_dept_4 (code) USING BTREE
) ENGINE = InnoDB
  CHARACTER SET = utf8
  COLLATE = utf8_general_ci COMMENT = '组织机构表'
  ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_dept
-- ----------------------------
INSERT INTO sys_dept (id, name, code, type, status, order_num, grade, parent_id, parent_name, parent_ids, create_by, create_date, update_by, update_date, del_flag) VALUES ('21173617daf14ae68bfd3b5550ff7264', '长沙1', 'cs3', 3, 1, 8, 3, 'b18e58a251d6415cb05dd77c2a0fb198', '长沙', null, null, '2020-06-25 07:45:59', 'c35d5b94aca547799fbe56ddd90bcfc4', '2020-09-03 20:45:52', '0');
INSERT INTO sys_dept (id, name, code, type, status, order_num, grade, parent_id, parent_name, parent_ids, create_by, create_date, update_by, update_date, del_flag) VALUES ('4c963d38ae25416ea3c1f141656b8f78', '湖北荆州', 'hb001002', 2, 1, 2, 2, 'd018f06a3a194ac68a3d0f5677e4cfbe', '湖北', null, null, '2020-06-25 07:45:59', 'c35d5b94aca547799fbe56ddd90bcfc4', '2020-09-03 20:45:37', '0');
INSERT INTO sys_dept (id, name, code, type, status, order_num, grade, parent_id, parent_name, parent_ids, create_by, create_date, update_by, update_date, del_flag) VALUES ('90e56a2a4e6a4add9a5b9a26fc212db2', '湖南', 'cs1', 1, 1, 3, 1, null, null, null, null, '2020-06-25 07:45:59', 'c35d5b94aca547799fbe56ddd90bcfc4', '2020-09-03 20:45:43', '0');
INSERT INTO sys_dept (id, name, code, type, status, order_num, grade, parent_id, parent_name, parent_ids, create_by, create_date, update_by, update_date, del_flag) VALUES ('b18e58a251d6415cb05dd77c2a0fb198', '长沙', 'cs2', 2, 1, 2, 2, '90e56a2a4e6a4add9a5b9a26fc212db2', '湖南', null, null, '2020-06-25 07:45:59', 'c35d5b94aca547799fbe56ddd90bcfc4', '2020-09-03 20:45:48', '0');
INSERT INTO sys_dept (id, name, code, type, status, order_num, grade, parent_id, parent_name, parent_ids, create_by, create_date, update_by, update_date, del_flag) VALUES ('ca06d9feadf143a7adb7977923e4e3cc', '湖北武汉', 'hb001001', 2, 1, 1, 2, 'd018f06a3a194ac68a3d0f5677e4cfbe', '湖北', null, null, '2020-06-25 07:45:59', 'c35d5b94aca547799fbe56ddd90bcfc4', '2020-09-03 20:45:27', '0');
INSERT INTO sys_dept (id, name, code, type, status, order_num, grade, parent_id, parent_name, parent_ids, create_by, create_date, update_by, update_date, del_flag) VALUES ('d018f06a3a194ac68a3d0f5677e4cfbe', '湖北', 'hb001', 1, 1, 1, 1, null, null, null, null, '2020-06-25 07:45:59', 'c35d5b94aca547799fbe56ddd90bcfc4', '2020-09-03 20:45:32', '0');

-- ----------------------------
-- Table structure for sys_role_menu
-- ----------------------------
DROP TABLE IF EXISTS sys_role_menu;
CREATE TABLE sys_role_menu  (
                                role_id varchar(64)  COMMENT '角色主键',
                                menu_id varchar(64)  COMMENT '菜单主键',
                                PRIMARY KEY (role_id, menu_id) USING BTREE,
                                INDEX sys_role_menu_1(menu_id) USING BTREE,
                                INDEX sys_role_menu_2(role_id) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '角色菜单关联表' ROW_FORMAT = Dynamic;
-- ----------------------------
-- Records of sys_role_menu
-- ----------------------------
INSERT INTO sys_role_menu (role_id, menu_id) VALUES ('1', '0b2c28fb18bc213a2ea7143cbf724702');
INSERT INTO sys_role_menu (role_id, menu_id) VALUES ('1', '1');
INSERT INTO sys_role_menu (role_id, menu_id) VALUES ('1', '1bca38c0d77841f6b39fe523b1607196');
INSERT INTO sys_role_menu (role_id, menu_id) VALUES ('1', '2');
INSERT INTO sys_role_menu (role_id, menu_id) VALUES ('1', '3');
INSERT INTO sys_role_menu (role_id, menu_id) VALUES ('1', '4');
INSERT INTO sys_role_menu (role_id, menu_id) VALUES ('1', '4e70a707c3d24b29aefe737d6a61b5c9');
INSERT INTO sys_role_menu (role_id, menu_id) VALUES ('1', '5');
INSERT INTO sys_role_menu (role_id, menu_id) VALUES ('1', '54f41ef8740a67b56a122453d0323ded');
INSERT INTO sys_role_menu (role_id, menu_id) VALUES ('1', '6');
INSERT INTO sys_role_menu (role_id, menu_id) VALUES ('1', '6b12cf99f99f4860ab4f686e55bdc380');
INSERT INTO sys_role_menu (role_id, menu_id) VALUES ('1', '7');
INSERT INTO sys_role_menu (role_id, menu_id) VALUES ('1', '8');
INSERT INTO sys_role_menu (role_id, menu_id) VALUES ('1', '9');
INSERT INTO sys_role_menu (role_id, menu_id) VALUES ('1', '9aa94a46ef6f4ae9a48d501871ce4fbf');
INSERT INTO sys_role_menu (role_id, menu_id) VALUES ('1', '9ffee089c8c24638b5b7f646da498cb3');
INSERT INTO sys_role_menu (role_id, menu_id) VALUES ('1', 'a38df56dd7f59f030a0bc449fcc97d57');
INSERT INTO sys_role_menu (role_id, menu_id) VALUES ('1', 'be14507626f7f301fbfc21ddbd8e6380');
INSERT INTO sys_role_menu (role_id, menu_id) VALUES ('1', 'd553d5090905465eb23cc5285c5f41ad');
INSERT INTO sys_role_menu (role_id, menu_id) VALUES ('ae153d7756e54234bde561ae1367f08f', '0b2c28fb18bc213a2ea7143cbf724702');
INSERT INTO sys_role_menu (role_id, menu_id) VALUES ('ae153d7756e54234bde561ae1367f08f', '2f0640f9f1fa452abe25643e14d8b3f4');
INSERT INTO sys_role_menu (role_id, menu_id) VALUES ('ae153d7756e54234bde561ae1367f08f', '3');
INSERT INTO sys_role_menu (role_id, menu_id) VALUES ('ae153d7756e54234bde561ae1367f08f', '6');
INSERT INTO sys_role_menu (role_id, menu_id) VALUES ('ae153d7756e54234bde561ae1367f08f', '8');
INSERT INTO sys_role_menu (role_id, menu_id) VALUES ('ae153d7756e54234bde561ae1367f08f', '9');
INSERT INTO sys_role_menu (role_id, menu_id) VALUES ('ae153d7756e54234bde561ae1367f08f', 'a38df56dd7f59f030a0bc449fcc97d57');
INSERT INTO sys_role_menu (role_id, menu_id) VALUES ('d1ece8903278fe25e8be2804fd755025', '0b2c28fb18bc213a2ea7143cbf724702');
INSERT INTO sys_role_menu (role_id, menu_id) VALUES ('d1ece8903278fe25e8be2804fd755025', '4');
INSERT INTO sys_role_menu (role_id, menu_id) VALUES ('d1ece8903278fe25e8be2804fd755025', '8');
INSERT INTO sys_role_menu (role_id, menu_id) VALUES ('d1ece8903278fe25e8be2804fd755025', '9');
INSERT INTO sys_role_menu (role_id, menu_id) VALUES ('d1ece8903278fe25e8be2804fd755025', 'a38df56dd7f59f030a0bc449fcc97d57');


-- ----------------------------
-- Table structure for sys_user_role
-- ----------------------------
DROP TABLE IF EXISTS sys_user_role;
CREATE TABLE sys_user_role  (
                                user_id varchar(64)  COMMENT '用户主键',
                                role_id varchar(64)  COMMENT '角色主键',
                                PRIMARY KEY (user_id, role_id) USING BTREE,
                                INDEX sys_user_role_1(user_id) USING BTREE,
                                INDEX sys_user_role_2(role_id) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户角色关联表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_user_role
-- ----------------------------
INSERT INTO sys_user_role (user_id, role_id) VALUES ('1', '1');
INSERT INTO sys_user_role (user_id, role_id) VALUES ('c35d5b94aca547799fbe56ddd90bcfc4', 'd1ece8903278fe25e8be2804fd755025');


-- ----------------------------
-- Table structure for sys_role_dept
-- ----------------------------
DROP TABLE IF EXISTS sys_role_dept;
CREATE TABLE sys_role_dept  (
                                role_id varchar(64)  COMMENT '角色主键',
                                dept_id varchar(64)  COMMENT '组织机构主键',
                                PRIMARY KEY (role_id, dept_id) USING BTREE,
                                INDEX sys_role_dept_1(dept_id) USING BTREE,
                                INDEX sys_role_dept_2(role_id) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '角色和组织机构关联表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sys_dict
-- ----------------------------
DROP TABLE IF EXISTS sys_dict;
CREATE TABLE sys_dict
(
    id          varchar(64) NOT NULL COMMENT '主键',
    code        varchar(50) COMMENT '值',
    name        varchar(50) COMMENT '名称',
    type        varchar(255) COMMENT '类型',
    parent_id   varchar(255) COMMENT '父级id',
    description varchar(500) COMMENT '描述',
    grade       int(4) COMMENT '层级',
    order_num   int(4) COMMENT '排序',
    remarks     varchar(500) COMMENT '备注',
    create_by   varchar(64) COMMENT '创建人',
    create_date timestamp  DEFAULT current_timestamp COMMENT '创建时间',
    update_by   varchar(64) COMMENT '更新人',
    update_date timestamp  DEFAULT current_timestamp COMMENT '更新时间',
    del_flag    varchar(4) default '0' COMMENT '删除标记',
    PRIMARY KEY (id) USING BTREE,
    INDEX sys_dict_1 (type) USING BTREE,
    INDEX sys_dict_2 (code) USING BTREE,
    INDEX sys_dict_3(parent_id) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '字典表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_dict
-- ----------------------------

INSERT INTO sys_dict (id, code, name, type, parent_id, description, order_num, remarks, create_by, create_date, update_by, update_date, del_flag) VALUES ('023d32e793844de1803407e4dea29ded', 'man', '男', 'sex', '9f4bb4c5e1ea409bb05e8a7668c2da5b', '', 0, '', null, '2020-06-25 07:45:59', null, '2020-06-25 07:45:59', '0');
INSERT INTO sys_dict (id, code, name, type, parent_id, description, order_num, remarks, create_by, create_date, update_by, update_date, del_flag) VALUES ('0e1a286107ca4519b3ec43b4a511b49d', 'cs', '测试', 'cs', '0', 'cs', 1, 'cs', null, '2020-06-25 07:45:59', null, '2020-06-25 07:45:59', '1');
INSERT INTO sys_dict (id, code, name, type, parent_id, description, order_num, remarks, create_by, create_date, update_by, update_date, del_flag) VALUES ('1f92faf87c6843b19938e156973a9f69', 'cs1', '测试2', 'cs1', '0', 'cs1', 2, 'cs1', null, '2020-06-25 07:45:59', null, '2020-06-25 07:45:59', '0');
INSERT INTO sys_dict (id, code, name, type, parent_id, description, order_num, remarks, create_by, create_date, update_by, update_date, del_flag) VALUES ('6a804fa0642a4e3aa660f21fc443c17f', 'female', '女', 'sex', '9f4bb4c5e1ea409bb05e8a7668c2da5b', 'af', 0, 'af', null, '2020-06-25 07:45:59', null, '2020-06-25 07:45:59', '0');
INSERT INTO sys_dict (id, code, name, type, parent_id, description, order_num, remarks, create_by, create_date, update_by, update_date, del_flag) VALUES ('83a28cb2a9574fa6969cb4740177d462', 'cs32', 'cs32', 'cs21', 'dfe403957ef14f6ea47b71c2e7c17fb8', 'cs32', 4, 'cs32', null, '2020-06-25 07:45:59', null, '2020-06-25 07:45:59', '0');
INSERT INTO sys_dict (id, code, name, type, parent_id, description, order_num, remarks, create_by, create_date, update_by, update_date, del_flag) VALUES ('9f4bb4c5e1ea409bb05e8a7668c2da5b', 'sex', '性别', 'sex', '0', '', 0, '', null, '2020-06-25 07:45:59', null, '2020-06-25 07:45:59', '0');
INSERT INTO sys_dict (id, code, name, type, parent_id, description, order_num, remarks, create_by, create_date, update_by, update_date, del_flag) VALUES ('a9087cc36b504136a9d5790f832eb1b5', '1', 'ce测试', 'cs', 'cebeca4d875b40e0a2f44c7e4843bc23', '擦', 1, 'ca ', null, '2020-06-25 07:45:59', null, '2020-06-25 07:45:59', '1');
INSERT INTO sys_dict (id, code, name, type, parent_id, description, order_num, remarks, create_by, create_date, update_by, update_date, del_flag) VALUES ('acac16f2a6854de489ee72eb839ef607', 'cs2', 'cs2', '1', 'a9087cc36b504136a9d5790f832eb1b5', 'av', 0, 'va', null, '2020-06-25 07:45:59', null, '2020-06-25 07:45:59', '1');
INSERT INTO sys_dict (id, code, name, type, parent_id, description, order_num, remarks, create_by, create_date, update_by, update_date, del_flag) VALUES ('cebeca4d875b40e0a2f44c7e4843bc23', 'cs', '测试', 'cs', '0', 'cs', 3, 'cs', null, '2020-06-25 07:45:59', null, '2020-06-25 07:45:59', '1');
INSERT INTO sys_dict (id, code, name, type, parent_id, description, order_num, remarks, create_by, create_date, update_by, update_date, del_flag) VALUES ('dfe403957ef14f6ea47b71c2e7c17fb8', 'cs21', 'cs21', 'cs1', '1f92faf87c6843b19938e156973a9f69', 'cs21', 2, 'cs21', null, '2020-06-25 07:45:59', null, '2020-06-25 07:45:59', '0');

-- ----------------------------
-- Table structure for sys_config
-- ----------------------------
DROP TABLE IF EXISTS sys_config;
CREATE TABLE sys_config  (
                             id varchar(64) NOT NULL COMMENT '主键',
                             value varchar(255)  COMMENT '值',
                             label varchar(255)  COMMENT '名称',
                             type varchar(255)  COMMENT '类型',
                             description varchar(500)  COMMENT '描述',
                             order_num int(4)  COMMENT '排序',
                             remarks varchar(500)  COMMENT '备注',
                             create_by varchar(64)  COMMENT '创建人',
                             create_date timestamp DEFAULT current_timestamp  COMMENT '创建时间',
                             update_by varchar(64)  COMMENT '更新人',
                             update_date timestamp DEFAULT current_timestamp  COMMENT '更新时间',
                             del_flag varchar(4) default '0'  COMMENT '删除标记',
                             PRIMARY KEY (id) USING BTREE,
                             INDEX sys_config_1(type) USING BTREE,
                             INDEX sys_config_2(value) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '设置表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sys_log
-- ----------------------------
DROP TABLE IF EXISTS sys_log;
CREATE TABLE sys_log  (
                          id varchar(64) NOT NULL COMMENT '主键',
                          user_id varchar(64)  COMMENT '登录id',
                          url varchar(255)  COMMENT 'url',
                          ip varchar(255)  COMMENT '登录ip',
                          method varchar(255)  COMMENT '请求方法',
                          params varchar(255)  COMMENT '请求参数',
                          user_agent varchar(255)  COMMENT '登录客户端',
                          use_time int(10)  COMMENT '耗时毫秒',
                          create_date timestamp DEFAULT current_timestamp  COMMENT '创建时间',
                          PRIMARY KEY (id) USING BTREE,
                          INDEX sys_log_1(user_id) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '操作日志表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sys_login_log
-- ----------------------------
DROP TABLE IF EXISTS sys_login_log;
CREATE TABLE sys_login_log  (
                                id varchar(64) NOT NULL COMMENT '主键',
                                user_name varchar(64)  COMMENT '登录用户名',
                                ip_addr varchar(255) COMMENT '登录ip',
                                status int(4) COMMENT '登录状态 1 登录成功 2 登陆失败',
                                user_agent varchar(255)  COMMENT '登录客户端',
                                browser varchar(255)  COMMENT '浏览器',
                                os varchar(255)  COMMENT '操作系统',
                                login_time timestamp DEFAULT current_timestamp  COMMENT '登陆时间',
                                PRIMARY KEY (id) USING BTREE,
                                INDEX sys_login_log_1(user_name) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '系统访问记录表' ROW_FORMAT = Dynamic;


-- ----------------------------
-- Table structure for sys_login_log
-- ----------------------------
DROP TABLE IF EXISTS sys_post;
CREATE TABLE sys_post  (
                           id varchar(64) NOT NULL COMMENT '主键',
                           name varchar(64)  COMMENT '名称',
                           code varchar(255) COMMENT '编码',
                           status int(4) COMMENT '状态 1 正常 2 禁用',
                           order_num   int(4) COMMENT '排序号',
                           description varchar(500)  COMMENT '描述',
                           remarks varchar(500)  COMMENT '备注',
                           create_by varchar(64)  COMMENT '创建人',
                           create_date timestamp DEFAULT current_timestamp  COMMENT '创建时间',
                           update_by varchar(64)  COMMENT '更新人',
                           update_date timestamp DEFAULT current_timestamp  COMMENT '更新时间',
                           del_flag varchar(4) default '0'  COMMENT '删除标记',
                           PRIMARY KEY (id) USING BTREE,
                           INDEX sys_post_1(code) USING BTREE,
                           INDEX sys_post_2(status) USING BTREE,
                           INDEX sys_post_3(del_flag) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '岗位表' ROW_FORMAT = Dynamic;


INSERT INTO sys_post (id, name, code, status, order_num, description, remarks, create_by, create_date, update_by, update_date, del_flag) VALUES ('1840f94177a74b3d908bff34c06c8433', '部门经理', '0002', 1, 2, null, null, '1', '2020-09-06 09:55:02', '1', '2020-09-06 10:05:15', '0');
INSERT INTO sys_post (id, name, code, status, order_num, description, remarks, create_by, create_date, update_by, update_date, del_flag) VALUES ('ffa64f88ef7e43b79d26fb69eacc9e16', '总经理', '0001', 1, 1, null, null, '1', '2020-09-06 09:54:38', '1', '2020-09-06 10:09:22', '0');


-- ----------------------------
-- 字典类型表
-- ----------------------------
drop table if exists sys_dict_type;
create table sys_dict_type
(
    id          varchar(64) NOT NULL COMMENT '主键',
    dict_name   varchar(100) comment '字典名称',
    dict_type   varchar(100) comment '字典类型',
    status      int(4)     default 1 comment '状态（1正常 2停用）',
    remarks     varchar(500) COMMENT '备注',
    create_by   varchar(64) COMMENT '创建人',
    create_date timestamp  DEFAULT current_timestamp COMMENT '创建时间',
    update_by   varchar(64) COMMENT '更新人',
    update_date timestamp  DEFAULT current_timestamp COMMENT '更新时间',
    del_flag    varchar(4) default '0' COMMENT '删除标记',
    PRIMARY KEY (id) USING BTREE,
    unique (dict_type),
    INDEX sys_dict_type_1 (status) USING BTREE,
    INDEX sys_dict_type_2 (dict_type) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '字典类型表' ROW_FORMAT = Dynamic;


-- ----------------------------
-- 字典数据表
-- ----------------------------
drop table if exists sys_dict_data;
create table sys_dict_data
(
    id           varchar(64) NOT NULL COMMENT '主键',
    label        varchar(100) comment '字典标签',
    value        varchar(100) comment '字典键值',
    type         varchar(100) comment '字典类型',
    default_flag char(1)    default '2' comment '是否默认（1是 2否）',
    dict_type    varchar(100) comment '字典类型',
    status       int(4)     default 1 comment '状态（1正常 2停用）',
    order_num    int(4) COMMENT '排序号',
    remarks      varchar(500) COMMENT '备注',
    create_by    varchar(64) COMMENT '创建人',
    create_date  timestamp  DEFAULT current_timestamp COMMENT '创建时间',
    update_by    varchar(64) COMMENT '更新人',
    update_date  timestamp  DEFAULT current_timestamp COMMENT '更新时间',
    del_flag     varchar(4) default '0' COMMENT '删除标记',
    PRIMARY KEY (id) USING BTREE,
    INDEX sys_dict_data_1 (status) USING BTREE,
    INDEX sys_dict_data_2 (dict_type) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '字典数据表' ROW_FORMAT = Dynamic;

