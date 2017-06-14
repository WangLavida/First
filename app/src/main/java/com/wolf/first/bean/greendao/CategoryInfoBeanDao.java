package com.wolf.first.bean.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.wolf.first.bean.CategoryInfoBean;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "CATEGORY_INFO_BEAN".
*/
public class CategoryInfoBeanDao extends AbstractDao<CategoryInfoBean, Long> {

    public static final String TABLENAME = "CATEGORY_INFO_BEAN";

    /**
     * Properties of entity CategoryInfoBean.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property CtgId = new Property(1, String.class, "ctgId", false, "CTG_ID");
        public final static Property Name = new Property(2, String.class, "name", false, "NAME");
        public final static Property ParentId = new Property(3, String.class, "parentId", false, "PARENT_ID");
    }


    public CategoryInfoBeanDao(DaoConfig config) {
        super(config);
    }
    
    public CategoryInfoBeanDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"CATEGORY_INFO_BEAN\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"CTG_ID\" TEXT," + // 1: ctgId
                "\"NAME\" TEXT," + // 2: name
                "\"PARENT_ID\" TEXT);"); // 3: parentId
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"CATEGORY_INFO_BEAN\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, CategoryInfoBean entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String ctgId = entity.getCtgId();
        if (ctgId != null) {
            stmt.bindString(2, ctgId);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(3, name);
        }
 
        String parentId = entity.getParentId();
        if (parentId != null) {
            stmt.bindString(4, parentId);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, CategoryInfoBean entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String ctgId = entity.getCtgId();
        if (ctgId != null) {
            stmt.bindString(2, ctgId);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(3, name);
        }
 
        String parentId = entity.getParentId();
        if (parentId != null) {
            stmt.bindString(4, parentId);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public CategoryInfoBean readEntity(Cursor cursor, int offset) {
        CategoryInfoBean entity = new CategoryInfoBean( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // ctgId
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // name
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3) // parentId
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, CategoryInfoBean entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setCtgId(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setName(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setParentId(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(CategoryInfoBean entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(CategoryInfoBean entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(CategoryInfoBean entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
