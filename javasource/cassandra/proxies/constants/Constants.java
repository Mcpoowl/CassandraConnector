// This file was generated by Mendix Modeler 7.0.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package cassandra.proxies.constants;

import com.mendix.core.Core;

public class Constants
{
	// These are the constants for the Cassandra module

	/**
	* can be multiple hosts, when contacting a cluster, seperated with a comma (,)
	* 
	* Example:
	* 
	* cassandra-host1.com, cassandra-host2.com
	*/
	public static java.lang.String getClusterLocation()
	{
		return (java.lang.String)Core.getConfiguration().getConstantValue("Cassandra.ClusterLocation");
	}

	public static java.lang.String getClusterName()
	{
		return (java.lang.String)Core.getConfiguration().getConstantValue("Cassandra.ClusterName");
	}

	public static java.lang.String getKeyspaceName()
	{
		return (java.lang.String)Core.getConfiguration().getConstantValue("Cassandra.KeyspaceName");
	}
}