# CassandraConnector
Mendix Cassandra Connector

# Typical Usage Scenario 
Have loads of data in your Cassandra environment and you want to use this data in Mendix? Use the Cassandra Connector
 

# Dependencies
* Mendix 7.0.2 and up




# Installation
* Download the Cassandra Connector from the Appstore
* Fill in the required constants which point to your Cassandra installation
* Call the Exequety Query microflow action and process the results to your liking.

# Constants
* ClusterLocation; the location of your Cassandra Cluster. Can be multiple hosts, seperated with a comma
* ClusterName; the name of your Cassandra Cluster
* KeyspaceName; name of the keyspace you want to query

Not filling in these constants with the correct values will cause the Connector to not work properly

# Notes

* Cassandra supports a multitude of datatypes, not all known to Mendix, therefore, the library does a mapping of Cassandra datatypes to known Mendix/Java datatypes:

| Cassandra Datatype    | Mendix Datatype    |
|:---------------------:|:------------------:|
| ASCII                 | String      	     |
| BIGINT                | Long    	         |
| BLOB                  | NOT SUPPORTED	     | 
| BOOLEAN               | Boolean      	     |
| COUNTER               | NOT SUPPORTED  	 |
| DECIMAL               | BigDecimal   	     | 
| DOUBLE                | Double             |  
| FLOAT                 | Float              |
| INET                  | String             |  
| INT                   | Integer            |  
| TEXT                  | String             |  
| TIMESTAMP             | Date               |  
| UUID     		        | String             |
| VARCHAR  		        | String             |  
| VARINT     	        | BigInteger         |  
| TIMEUUID     	 	    | String             |  
| LIST	                | NOT SUPPORTED    	 |
| SET   	            | NOT SUPPORTED      |
| MAP      		        | NOT SUPPORTED      |
| CUSTOM     	        | NOT SUPPORTED      |
| UDT     	            | NOT SUPPORTED      |
| TUPLE      	        | NOT SUPPORTED      | 
| SMALLINT    	        | Integer            |
| TINYINT       	    | Integer            |
| DATE  	            | String             |
| TIME  	            | Long               |


* Works with Mendix 7 and up because of the Security Manager in the cloud



# Disclaimer

This module was intended to show you how to easily connect to a Cassandra instance and get results quickly. Cassandra is capable of much more than currently possible with this module. If you need an extension to the module, or something not currently supported, feel free to contact us!


