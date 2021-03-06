package com.wanghaisheng.weiyang.database;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

import com.wanghaisheng.weiyang.database.MeishiBean;
import com.wanghaisheng.weiyang.database.Channel;

import com.wanghaisheng.weiyang.database.MeishiBeanDao;
import com.wanghaisheng.weiyang.database.ChannelDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see de.greenrobot.dao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig meishiBeanDaoConfig;
    private final DaoConfig channelDaoConfig;

    private final MeishiBeanDao meishiBeanDao;
    private final ChannelDao channelDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        meishiBeanDaoConfig = daoConfigMap.get(MeishiBeanDao.class).clone();
        meishiBeanDaoConfig.initIdentityScope(type);

        channelDaoConfig = daoConfigMap.get(ChannelDao.class).clone();
        channelDaoConfig.initIdentityScope(type);

        meishiBeanDao = new MeishiBeanDao(meishiBeanDaoConfig, this);
        channelDao = new ChannelDao(channelDaoConfig, this);

        registerDao(MeishiBean.class, meishiBeanDao);
        registerDao(Channel.class, channelDao);
    }
    
    public void clear() {
        meishiBeanDaoConfig.getIdentityScope().clear();
        channelDaoConfig.getIdentityScope().clear();
    }

    public MeishiBeanDao getMeishiBeanDao() {
        return meishiBeanDao;
    }

    public ChannelDao getChannelDao() {
        return channelDao;
    }

}
