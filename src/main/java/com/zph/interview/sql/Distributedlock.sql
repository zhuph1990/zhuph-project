DROP TABLE IF EXISTS `method_lock`;
CREATE TABLE `method_lock` (
       `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
       `method_name` varchar(64) NOT NULL COMMENT '锁定的方法名',
       `desc` varchar(255) NOT NULL COMMENT '备注信息',
       `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
       PRIMARY KEY (`id`),
       UNIQUE KEY `uidx_method_name` (`method_name`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='锁定中的方法';