package com.sqlite.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.exp.sign.BmobUser;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "BMOB_USER".
*/
public class BmobUserDao extends AbstractDao<BmobUser, Long> {

    public static final String TABLENAME = "BMOB_USER";

    /**
     * Properties of entity BmobUser.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, long.class, "id", true, "_id");
        public final static Property Number = new Property(1, String.class, "number", false, "NUMBER");
        public final static Property Name = new Property(2, String.class, "name", false, "NAME");
        public final static Property Username = new Property(3, String.class, "username", false, "USERNAME");
        public final static Property Password = new Property(4, String.class, "password", false, "PASSWORD");
        public final static Property Sex = new Property(5, String.class, "sex", false, "SEX");
        public final static Property Phone = new Property(6, String.class, "phone", false, "PHONE");
        public final static Property Address = new Property(7, String.class, "address", false, "ADDRESS");
        public final static Property Email = new Property(8, String.class, "email", false, "EMAIL");
    }


    public BmobUserDao(DaoConfig config) {
        super(config);
    }
    
    public BmobUserDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"BMOB_USER\" (" + //
                "\"_id\" INTEGER PRIMARY KEY NOT NULL ," + // 0: id
                "\"NUMBER\" TEXT," + // 1: number
                "\"NAME\" TEXT," + // 2: name
                "\"USERNAME\" TEXT," + // 3: username
                "\"PASSWORD\" TEXT," + // 4: password
                "\"SEX\" TEXT," + // 5: sex
                "\"PHONE\" TEXT," + // 6: phone
                "\"ADDRESS\" TEXT," + // 7: address
                "\"EMAIL\" TEXT);"); // 8: email
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"BMOB_USER\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, BmobUser entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getId());
 
        String number = entity.getNumber();
        if (number != null) {
            stmt.bindString(2, number);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(3, name);
        }
 
        String username = entity.getUsername();
        if (username != null) {
            stmt.bindString(4, username);
        }
 
        String password = entity.getPassword();
        if (password != null) {
            stmt.bindString(5, password);
        }
 
        String sex = entity.getSex();
        if (sex != null) {
            stmt.bindString(6, sex);
        }
 
        String phone = entity.getPhone();
        if (phone != null) {
            stmt.bindString(7, phone);
        }
 
        String address = entity.getAddress();
        if (address != null) {
            stmt.bindString(8, address);
        }
 
        String email = entity.getEmail();
        if (email != null) {
            stmt.bindString(9, email);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, BmobUser entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getId());
 
        String number = entity.getNumber();
        if (number != null) {
            stmt.bindString(2, number);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(3, name);
        }
 
        String username = entity.getUsername();
        if (username != null) {
            stmt.bindString(4, username);
        }
 
        String password = entity.getPassword();
        if (password != null) {
            stmt.bindString(5, password);
        }
 
        String sex = entity.getSex();
        if (sex != null) {
            stmt.bindString(6, sex);
        }
 
        String phone = entity.getPhone();
        if (phone != null) {
            stmt.bindString(7, phone);
        }
 
        String address = entity.getAddress();
        if (address != null) {
            stmt.bindString(8, address);
        }
 
        String email = entity.getEmail();
        if (email != null) {
            stmt.bindString(9, email);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.getLong(offset + 0);
    }    

    @Override
    public BmobUser readEntity(Cursor cursor, int offset) {
        BmobUser entity = new BmobUser( //
            cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // number
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // name
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // username
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // password
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // sex
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // phone
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // address
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8) // email
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, BmobUser entity, int offset) {
        entity.setId(cursor.getLong(offset + 0));
        entity.setNumber(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setName(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setUsername(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setPassword(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setSex(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setPhone(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setAddress(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setEmail(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(BmobUser entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(BmobUser entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(BmobUser entity) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
