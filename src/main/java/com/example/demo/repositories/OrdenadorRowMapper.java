package com.example.demo.repositories;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.demo.negocio.Ordenador;

public class OrdenadorRowMapper implements RowMapper <Ordenador> {

    @Override
    public Ordenador mapRow(ResultSet rs, int romNum) throws SQLException {
        return new Ordenador (rs.getInt("numero"), rs.getString("marca"), rs.getString("modelo"),rs.getInt("precio"));
    }



}
