ALTER TABLE job_card ADD COLUMN job_manager_id int(10);
ALTER TABLE job_card ADD COLUMN delivered_by varchar(100);
ALTER TABLE job_card ADD COLUMN delivered_by_phone_number varchar(100);
ALTER TABLE user_detail ADD COLUMN email varchar(100);
ALTER TABLE job_card ADD INDEX FKjob_card213367 (job_manager_id), ADD CONSTRAINT FKjob_card213367 FOREIGN KEY (job_manager_id) REFERENCES user_detail (user_detail_id);
