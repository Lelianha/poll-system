DROP TABLE IF EXISTS poll;
DROP TABLE IF EXISTS user;
DROP TABLE IF EXISTS answers;


CREATE TABLE poll (
    id int(11) unsigned NOT NULL AUTO_INCREMENT,
    title varchar(300)  ,
   first_option varchar(300)  ,
   second_option varchar(300)  ,
   third_option varchar(300)  ,
   fourth_option varchar(300)  ,
    PRIMARY KEY (id)
);


CREATE TABLE user (
    id int(11) unsigned NOT NULL AUTO_INCREMENT,
    first_name varchar(300) ,
    last_name varchar(300) ,
    email varchar(300) ,
    age int(11)  ,
    address varchar(300)  ,
   joining_date date NOT NULL ,
    PRIMARY KEY (id)
);



 CREATE TABLE answers (
    id int(11) unsigned NOT NULL AUTO_INCREMENT,
       user_id int (11),
      question_id int (11)  NOT NULL  ,
         answer  varchar (300)  NOT NULL DEFAULT 'NO',
        PRIMARY KEY (id),
          FOREIGN KEY (user_id) REFERENCES user(id) ON DELETE CASCADE ,
                FOREIGN KEY (question_id) REFERENCES poll(id) ON DELETE CASCADE

);



INSERT INTO poll (title , first_option , second_option , third_option , fourth_option ) VALUES

('How many hours do you sleep?','12h','8h','6h',' 4h'  ),
('Between the following , what is your favorite color?','Green','Blue','Black',' White' ),
('Between the following, what do you most love to do?','Watch TV','Play the computer','Hanging out with friends','Travel the world'  ),
('What do you rather the most?','Ride a bike',' Ride a horse','Drive a car',' Ride a motorcycle' ),
('Which would you rather do?','Wash dishes',' Mow the lawn',' Clean the bathroom','Vacuum the house' ),
('Where is your preferred place to travel?','USA','France',' South America','Thailand'),
('What gift would you like to receive?','Money','Phone','Smart  watch','Shoes' ),
('What is your biggest fear?','Death','Heights','Darkness',' Snakes' ),
('If you could only eat one meal for the rest of your life, what would it be?','Pizza','Spaghetti','Sushi',' Burger' ),
('What would you do if you won the lottery?','Buy a car','Buy a villa','Travel','Starting a special project'  );