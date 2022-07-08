CREATE TABLE ${infoName} (${properties}PRIMARY KEY(${pkey}) NOT ENFORCED) WITH (
'connector' ='${connector}',
'hostname'='${hostName}',
'port'='${port}',
'username'='${userName}',
'password'='${password}',
'database-name'='${dataBaseName}',
'schema-name'='${schemName}',
'table-name'='${tableName}',
'debezium.log.mining.continuous.mine'='true',
'debezium.log.mining.strategy'='online_catalog',
'debezium.database.tablename.case.insensitive'='false',
'scan.startup.mode' = 'initial')
