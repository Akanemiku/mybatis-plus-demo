/*
Navicat MySQL Data Transfer

Source Server         : MySQL
Source Server Version : 80013
Source Host           : localhost:3306
Source Database       : paper

Target Server Type    : MYSQL
Target Server Version : 80013
File Encoding         : 65001

Date: 2020-05-15 11:24:41
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `student_id` int(11) NOT NULL AUTO_INCREMENT,
  `student_no` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `college` varchar(255) NOT NULL,
  `time` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`student_id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('2', '1701030218', '边昊穹', '信息技术学院', '2020-05-13 17:42:15');
INSERT INTO `student` VALUES ('3', '1718020028', '唐舞桐', '国际商学部', '2020-05-13 17:42:15');
INSERT INTO `student` VALUES ('4', '1718020372', '萧芳瑞', '国际商学部', '2020-05-13 17:42:15');
INSERT INTO `student` VALUES ('5', '1718020188', '徐长卿', '国际商学部', '2020-05-13 17:42:15');
INSERT INTO `student` VALUES ('6', '1701030194', '穆元武', '信息技术学院', '2020-05-13 17:42:15');
INSERT INTO `student` VALUES ('7', '1702020712', '郜伟泽', '管理学院', '2020-05-13 17:42:15');
INSERT INTO `student` VALUES ('11', '123456', 'test', 'test', '2020-05-13 17:50:16');
INSERT INTO `student` VALUES ('12', '62334234', 'test', 'test', '2020-05-13 17:50:18');
INSERT INTO `student` VALUES ('16', '547465434', '6666', '88888', '2020-05-13 17:50:21');
