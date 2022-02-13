package com.ecommerce;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.swing.tree.RowMapper;


import org.springframework.jndi.JndiTemplate;


public class EProductDAO {

        JndiTemplate template;    
            
        public void setTemplate(JndiTemplate template) {    
            this.template = template;    
        }    
        
        public List<EProduct> getProducts(){    
            return template.query("select * from eproduct",new RowMapper<EProduct>(){    
                public EProduct mapRow(ResultSet rs, int row) throws SQLException {    
                        EProduct e=new EProduct();    
                    e.setId(rs.getInt(1));    
                    e.setName(rs.getString(2));    
                    e.setPrice(rs.getBigDecimal(3));    
                    e.setDateAdded(rs.getDate(4));    
                    return e;    
                }    
            });    
        }    
}

