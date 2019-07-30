import sqlite3
import db, create_db, add_data

def main():
    conn = db.getConnection()
    query = conn.cursor()

    area = db.dictionary_factory(query, 4)
    print (area)