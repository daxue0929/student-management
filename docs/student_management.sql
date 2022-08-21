/*
 Navicat Premium Data Transfer

 Source Server         : 本地mysql55
 Source Server Type    : MySQL
 Source Server Version : 50544
 Source Host           : localhost:3306
 Source Schema         : student_management

 Target Server Type    : MySQL
 Target Server Version : 50544
 File Encoding         : 65001

 Date: 20/08/2022 13:05:08
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(100) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '逻辑主键',
  `user_id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '业务主键',
  `username` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '登录用户名',
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '密码',
  `nick_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '真实姓名、中文名',
  `locked` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '是否锁定：0：正常；-1：被锁',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;


-- ----------------------------
-- Table structure for config
-- ----------------------------
DROP TABLE IF EXISTS `config`;
CREATE TABLE `config`  (
  `id` int(100) NOT NULL AUTO_INCREMENT COMMENT '逻辑主键',
  `config_id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '业务主键',
  `key` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `value` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of config
-- ----------------------------
INSERT INTO `config` VALUES (1, '4e4b215b47914666ada1084aece95cc8', 'websiteName', '教务管理系统');
INSERT INTO `config` VALUES (2, '63ee9ef94cfa4d228752408a5b853ba4', 'websiteDescription', '一个教务系统');
INSERT INTO `config` VALUES (3, '8b13f4a78c894d639c899540e26be1aa', 'websiteLogo', '/admin/dist/img/logo2.png');
INSERT INTO `config` VALUES (4, 'ff702813c92e449da7de2ee5e5eb696e', 'websiteIcon', '/admin/dist/img/favicon.png');
INSERT INTO `config` VALUES (5, 'ac6dcf337391417db63f6839cff05336', 'yourAvatar', '/admin/dist/img/13.png');
INSERT INTO `config` VALUES (6, '7456c23c73564ec58c7cb98c74e592cf', 'yourEmail', '2365696858@qq.com');
INSERT INTO `config` VALUES (7, '4c2063ce250b4bf19b55be09844a324c', 'yourName', '大雪');
INSERT INTO `config` VALUES (8, '7fc1c60999f94231bdd4a2438b3a5b77', 'footerAbout', '这个教务系统还不错。');
INSERT INTO `config` VALUES (9, '68cd3081457740baaab927f52538e963', 'footerICP', '浙ICP备 xxxxxx-x号');
INSERT INTO `config` VALUES (10, 'ceabd2a8f47d409ca971e67263e599af', 'footerCopyRight', '@2018 十三');
INSERT INTO `config` VALUES (11, '2a84408f7a8a4beaafd2cccd08116cb2', 'footerPoweredBy', '大雪');
INSERT INTO `config` VALUES (12, 'a7d85f721ca2464892bb9bc3c5f4fa92', 'footerPoweredByURL', '##');




SET FOREIGN_KEY_CHECKS = 1;
