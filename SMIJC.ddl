ALTER TABLE user_detail ADD COLUMN is_deleted int(1) NOT NULL;
ALTER TABLE user_detail ADD COLUMN is_active int(1) NOT NULL;
ALTER TABLE group_right ADD COLUMN job_card_id int(10) NOT NULL;
ALTER TABLE group_right ADD COLUMN delivery_note_id int(10) NOT NULL;
CREATE TABLE login_session (login_session_id int(10) NOT NULL AUTO_INCREMENT, user_detail_id int(10) NOT NULL, session_id varchar(100) NOT NULL, remote_ip varchar(100) NOT NULL, remote_host varchar(100) NOT NULL, remote_user varchar(100) NOT NULL, is_active int(1) NOT NULL, is_deleted int(1) NOT NULL, add_date datetime NOT NULL, add_by int(11) NOT NULL, last_edit_date datetime NULL, last_edit_by int(11), PRIMARY KEY (login_session_id)) ENGINE=InnoDB;
ALTER TABLE group_right ADD INDEX FKgroup_righ155511 (job_card_id), ADD CONSTRAINT FKgroup_righ155511 FOREIGN KEY (job_card_id) REFERENCES job_card (job_card_id);
ALTER TABLE group_right ADD INDEX FKgroup_righ589541 (delivery_note_id), ADD CONSTRAINT FKgroup_righ589541 FOREIGN KEY (delivery_note_id) REFERENCES delivery_note (delivery_note_id);
ALTER TABLE login_session ADD INDEX FKlogin_sess511752 (user_detail_id), ADD CONSTRAINT FKlogin_sess511752 FOREIGN KEY (user_detail_id) REFERENCES user_detail (user_detail_id);
