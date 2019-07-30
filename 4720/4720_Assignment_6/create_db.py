import do_command
import MySQLdb

def do_drop():
    drop_area = """drop table if exists area"""
    do_command(drop_area)
    drop_location = """drop table if exists location"""
    do_command(drop_location)
    drop_measurement = """drop table if exists measurement"""
    do_command(drop_measurement)
    drop_category = """drop table if exists category"""
    do_command(drop_category)
    drop_category_area = """drop table if exists category_area"""
    do_command(drop_category_area)

def do_create():

#AREA
        do_area = """
            create table area 
            (
              area_id int primary key,
              name varchar(50),
              longitude decimal,
              latitude decimal
            )
        """
        do_command(do_area)

#LOCATION
        do_location = """
            create table location 
            (
              location_id int primary key,
              name varchar(50),
              altitude decimal,
              location_area int,
              FOREIGN KEY (location_area) REFERENCES area (area_id)
            )
        """
        do_command(do_location)

#MEASUREMENT
        do_measurement = """
            create table measurement 
            (
              measurement_id int PRIMARY key,
              value decimal,
              measurement_location int,
              FOREIGN key (measurement_location) REFERENCES location (location_id)
            )
        """
        do_command(do_measurement)

#CATEGORY
        do_category = """
            create table category 
            (
              category_id int primary key,
              name varchar(50),
              description varchar
            )
        """
        do_command(do_category)

#CATERGORY_AREA
        do_category_area = """
            create table category_area 
            (
              category_id int,
              area_id int,
              PRIMARY key (category_id, area_id),
              FOREIGN key (category_id) REFERENCES category (category_id),
              FOREIGN key (area_id) references area (area_id)
            )
        """
        do_command(do_category_area)

if __name__ == "__main__":
    do_create()
    do_drop()