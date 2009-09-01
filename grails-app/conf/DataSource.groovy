dataSource {
    pooled = true
    driverClassName = "com.mysql.jdbc.Driver"
    username = "qprise"
    password = "sesamo"
	
    //	pooled = true
    //	driverClassName = "org.hsqldb.jdbcDriver"
    //	username = "sa"
    //	password = ""
	
}
hibernate {
    bytecode.provider=cglib
    cache.use_second_level_cache=true
    cache.use_query_cache=true
    cache.provider_class='com.opensymphony.oscache.hibernate.OSCacheProvider'
}


//environments {
//	development {
//		dataSource {
//			dbCreate = "create-drop" // one of 'create', 'create-drop','update'
//			url = "jdbc:hsqldb:mem:devDB"
//		}
//	}
//	test {
//		dataSource {
//			dbCreate = "update"
//			url = "jdbc:hsqldb:mem:testDb"
//		}
//	}
//	production {
//		dataSource {
//			dbCreate = "update"
//			url = "jdbc:hsqldb:file:prodDb;shutdown=true"
//		}
//	}
//}





// environment specific settings
environments {
    development {
        dataSource {
            dbCreate = "update" // one of 'create', 'create-drop','update'
            //url = "jdbc:mysql://onix.xioh.net:3306/qprise_devdb"
            url = "jdbc:mysql://localhost:3306/qprise_devdb"
        }
    }
    test {
        dataSource {
            dbCreate = "update"
            url = "jdbc:mysql://onix.xioh.net:3306/qprise_testdb"
            //url = "jdbc:mysql://localhost:3306/qprise_testdb"
        }
    }
    production {
        dataSource {
            dbCreate = "update"
            url = "jdbc:mysql://localhost:3306/qprise_proddb"
        }
    }
}