ALTER TABLE group_right ADD COLUMN group_right_function varchar(255) NOT NULL;
ALTER TABLE group_right ADD INDEX FKgroup_righ111908 (group_detail_id), ADD CONSTRAINT FKgroup_righ111908 FOREIGN KEY (group_detail_id) REFERENCES group_detail (group_detail_id);
