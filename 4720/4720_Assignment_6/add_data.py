from sqlite3 import connect
import random

def add_data():
    random.seed(37)

    conn = connect("measures.sqlite")
    crs = conn.cursor()

    check_cmd = "PRAGMA foreign_keys=ON;"
    crs.execute(check_cmd)

#AREA name, longitute, latitude
    area_data = [
        [1, "Atlanta", 10, 25],
        [2, "Marietta", 20, 30],
        [3, "Kennesaw", 40, 60],
        [4, "Athens", 30, 70],
        [5, "Woodstock", 26, 80],
    ]
    area_cmd = """
        insert into area (area_id, name, longitude, latitude)
        values(?, ?, ?, ?)"""
    for ad in area_data:
        n = crs.execute(area_cmd, ad)

#LOCATION name, altitude, location area
    location_data = [
        [11, "Airport", 150, 1],
        [12, "Downtown", 100, 2],
        [13, "University", 200, 3],
        [14, "Mall", 175, 4],
        [15, "Outlet", 250, 5],
    ]
    no_measurements_location_id = 23
    location_cmd = """
        insert into location
          (location_id, name, altitude, location_area)
          values (?,?,?,?)"""
    for loc in location_data:
        crs.execute(location_cmd, loc)

#MEASUREMENT
    measurement_cmd = """
    insert into measurement
    (measurement_id, value, measurement_location)
          values (?,?,?)"""

    category_data = [
        [17, "Mountains", "Mountains exist in this area", [3,5]],
        [18, "Populated", "This area is densely populated", [1,2,3]],
        [19, "Rural", "There are farms in this area", [4,5]],
    ]

    category__cmd = """
        insert into category
            (category_id, name, description)
            values (?,?,?);
    """

    category__area_cmd = """
        insert into category_area
            (category_id, area_id)
            values (?,?);
    """

    for cat in category_data:
        crs.execute(category__cmd, cat[:3])
        id_cat = cat[0]
        for id_ar in cat[3]:
            #print(id_cat, id_ar)
            crs.execute(category__area_cmd, [id_cat, id_ar])

    num_meas_per_loc = 10

    for loc in location_data:
        loc_id = loc[0]
        if loc_id != no_measurements_location_id:
            for meas_id in range(loc_id*100, loc_id*100+num_meas_per_loc):
                vals = [meas_id, random.uniform(5+loc_id*3, 15+loc_id*3), loc_id]
                crs.execute(measurement_cmd, vals)

    conn.commit()

    conn.close()

if __name__ == "__main__":
    add_data()