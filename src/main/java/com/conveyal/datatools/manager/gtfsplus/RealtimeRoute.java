package com.conveyal.datatools.manager.gtfsplus;

import com.conveyal.gtfs.model.Entity;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RealtimeRoute extends Entity {
    private static final long serialVersionUID = 1L;

    public String route_id;
    public int realtime_enabled;
    public String realtime_routename;
    public String realtime_routecode;

    // TODO
    @Override
    public void setStatementParameters(PreparedStatement statement, boolean setDefaultId) throws SQLException {

    }
}