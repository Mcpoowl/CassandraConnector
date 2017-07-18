// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package cassandra.proxies;

public class ResultObject
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject resultObjectMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Cassandra.ResultObject";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		type_ascii("type_ascii"),
		type_boolean("type_boolean"),
		type_smallint("type_smallint"),
		type_decimal("type_decimal"),
		type_inet("type_inet"),
		type_int("type_int"),
		type_timestamp("type_timestamp"),
		type_varchar("type_varchar"),
		type_varint("type_varint"),
		type_timeuuid("type_timeuuid"),
		type_date("type_date"),
		type_time("type_time"),
		name("name"),
		recipe("recipe"),
		type_uuid("type_uuid"),
		type_bigint("type_bigint"),
		type_tinyint("type_tinyint"),
		type_text("type_text"),
		ResultObject_Query("Cassandra.ResultObject_Query");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public ResultObject(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Cassandra.ResultObject"));
	}

	protected ResultObject(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject resultObjectMendixObject)
	{
		if (resultObjectMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Cassandra.ResultObject", resultObjectMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Cassandra.ResultObject");

		this.resultObjectMendixObject = resultObjectMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'ResultObject.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static cassandra.proxies.ResultObject initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return cassandra.proxies.ResultObject.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static cassandra.proxies.ResultObject initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new cassandra.proxies.ResultObject(context, mendixObject);
	}

	public static cassandra.proxies.ResultObject load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return cassandra.proxies.ResultObject.initialize(context, mendixObject);
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of type_ascii
	 */
	public final java.lang.String gettype_ascii()
	{
		return gettype_ascii(getContext());
	}

	/**
	 * @param context
	 * @return value of type_ascii
	 */
	public final java.lang.String gettype_ascii(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.type_ascii.toString());
	}

	/**
	 * Set value of type_ascii
	 * @param type_ascii
	 */
	public final void settype_ascii(java.lang.String type_ascii)
	{
		settype_ascii(getContext(), type_ascii);
	}

	/**
	 * Set value of type_ascii
	 * @param context
	 * @param type_ascii
	 */
	public final void settype_ascii(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String type_ascii)
	{
		getMendixObject().setValue(context, MemberNames.type_ascii.toString(), type_ascii);
	}

	/**
	 * @return value of type_boolean
	 */
	public final java.lang.Boolean gettype_boolean()
	{
		return gettype_boolean(getContext());
	}

	/**
	 * @param context
	 * @return value of type_boolean
	 */
	public final java.lang.Boolean gettype_boolean(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.type_boolean.toString());
	}

	/**
	 * Set value of type_boolean
	 * @param type_boolean
	 */
	public final void settype_boolean(java.lang.Boolean type_boolean)
	{
		settype_boolean(getContext(), type_boolean);
	}

	/**
	 * Set value of type_boolean
	 * @param context
	 * @param type_boolean
	 */
	public final void settype_boolean(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean type_boolean)
	{
		getMendixObject().setValue(context, MemberNames.type_boolean.toString(), type_boolean);
	}

	/**
	 * @return value of type_smallint
	 */
	public final java.lang.Integer gettype_smallint()
	{
		return gettype_smallint(getContext());
	}

	/**
	 * @param context
	 * @return value of type_smallint
	 */
	public final java.lang.Integer gettype_smallint(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.type_smallint.toString());
	}

	/**
	 * Set value of type_smallint
	 * @param type_smallint
	 */
	public final void settype_smallint(java.lang.Integer type_smallint)
	{
		settype_smallint(getContext(), type_smallint);
	}

	/**
	 * Set value of type_smallint
	 * @param context
	 * @param type_smallint
	 */
	public final void settype_smallint(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer type_smallint)
	{
		getMendixObject().setValue(context, MemberNames.type_smallint.toString(), type_smallint);
	}

	/**
	 * @return value of type_decimal
	 */
	public final java.math.BigDecimal gettype_decimal()
	{
		return gettype_decimal(getContext());
	}

	/**
	 * @param context
	 * @return value of type_decimal
	 */
	public final java.math.BigDecimal gettype_decimal(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.type_decimal.toString());
	}

	/**
	 * Set value of type_decimal
	 * @param type_decimal
	 */
	public final void settype_decimal(java.math.BigDecimal type_decimal)
	{
		settype_decimal(getContext(), type_decimal);
	}

	/**
	 * Set value of type_decimal
	 * @param context
	 * @param type_decimal
	 */
	public final void settype_decimal(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal type_decimal)
	{
		getMendixObject().setValue(context, MemberNames.type_decimal.toString(), type_decimal);
	}

	/**
	 * @return value of type_inet
	 */
	public final java.lang.String gettype_inet()
	{
		return gettype_inet(getContext());
	}

	/**
	 * @param context
	 * @return value of type_inet
	 */
	public final java.lang.String gettype_inet(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.type_inet.toString());
	}

	/**
	 * Set value of type_inet
	 * @param type_inet
	 */
	public final void settype_inet(java.lang.String type_inet)
	{
		settype_inet(getContext(), type_inet);
	}

	/**
	 * Set value of type_inet
	 * @param context
	 * @param type_inet
	 */
	public final void settype_inet(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String type_inet)
	{
		getMendixObject().setValue(context, MemberNames.type_inet.toString(), type_inet);
	}

	/**
	 * @return value of type_int
	 */
	public final java.lang.Integer gettype_int()
	{
		return gettype_int(getContext());
	}

	/**
	 * @param context
	 * @return value of type_int
	 */
	public final java.lang.Integer gettype_int(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.type_int.toString());
	}

	/**
	 * Set value of type_int
	 * @param type_int
	 */
	public final void settype_int(java.lang.Integer type_int)
	{
		settype_int(getContext(), type_int);
	}

	/**
	 * Set value of type_int
	 * @param context
	 * @param type_int
	 */
	public final void settype_int(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer type_int)
	{
		getMendixObject().setValue(context, MemberNames.type_int.toString(), type_int);
	}

	/**
	 * @return value of type_timestamp
	 */
	public final java.util.Date gettype_timestamp()
	{
		return gettype_timestamp(getContext());
	}

	/**
	 * @param context
	 * @return value of type_timestamp
	 */
	public final java.util.Date gettype_timestamp(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.type_timestamp.toString());
	}

	/**
	 * Set value of type_timestamp
	 * @param type_timestamp
	 */
	public final void settype_timestamp(java.util.Date type_timestamp)
	{
		settype_timestamp(getContext(), type_timestamp);
	}

	/**
	 * Set value of type_timestamp
	 * @param context
	 * @param type_timestamp
	 */
	public final void settype_timestamp(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date type_timestamp)
	{
		getMendixObject().setValue(context, MemberNames.type_timestamp.toString(), type_timestamp);
	}

	/**
	 * @return value of type_varchar
	 */
	public final java.lang.String gettype_varchar()
	{
		return gettype_varchar(getContext());
	}

	/**
	 * @param context
	 * @return value of type_varchar
	 */
	public final java.lang.String gettype_varchar(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.type_varchar.toString());
	}

	/**
	 * Set value of type_varchar
	 * @param type_varchar
	 */
	public final void settype_varchar(java.lang.String type_varchar)
	{
		settype_varchar(getContext(), type_varchar);
	}

	/**
	 * Set value of type_varchar
	 * @param context
	 * @param type_varchar
	 */
	public final void settype_varchar(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String type_varchar)
	{
		getMendixObject().setValue(context, MemberNames.type_varchar.toString(), type_varchar);
	}

	/**
	 * @return value of type_varint
	 */
	public final java.math.BigDecimal gettype_varint()
	{
		return gettype_varint(getContext());
	}

	/**
	 * @param context
	 * @return value of type_varint
	 */
	public final java.math.BigDecimal gettype_varint(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.type_varint.toString());
	}

	/**
	 * Set value of type_varint
	 * @param type_varint
	 */
	public final void settype_varint(java.math.BigDecimal type_varint)
	{
		settype_varint(getContext(), type_varint);
	}

	/**
	 * Set value of type_varint
	 * @param context
	 * @param type_varint
	 */
	public final void settype_varint(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal type_varint)
	{
		getMendixObject().setValue(context, MemberNames.type_varint.toString(), type_varint);
	}

	/**
	 * @return value of type_timeuuid
	 */
	public final java.lang.String gettype_timeuuid()
	{
		return gettype_timeuuid(getContext());
	}

	/**
	 * @param context
	 * @return value of type_timeuuid
	 */
	public final java.lang.String gettype_timeuuid(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.type_timeuuid.toString());
	}

	/**
	 * Set value of type_timeuuid
	 * @param type_timeuuid
	 */
	public final void settype_timeuuid(java.lang.String type_timeuuid)
	{
		settype_timeuuid(getContext(), type_timeuuid);
	}

	/**
	 * Set value of type_timeuuid
	 * @param context
	 * @param type_timeuuid
	 */
	public final void settype_timeuuid(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String type_timeuuid)
	{
		getMendixObject().setValue(context, MemberNames.type_timeuuid.toString(), type_timeuuid);
	}

	/**
	 * @return value of type_date
	 */
	public final java.lang.String gettype_date()
	{
		return gettype_date(getContext());
	}

	/**
	 * @param context
	 * @return value of type_date
	 */
	public final java.lang.String gettype_date(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.type_date.toString());
	}

	/**
	 * Set value of type_date
	 * @param type_date
	 */
	public final void settype_date(java.lang.String type_date)
	{
		settype_date(getContext(), type_date);
	}

	/**
	 * Set value of type_date
	 * @param context
	 * @param type_date
	 */
	public final void settype_date(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String type_date)
	{
		getMendixObject().setValue(context, MemberNames.type_date.toString(), type_date);
	}

	/**
	 * @return value of type_time
	 */
	public final java.lang.Long gettype_time()
	{
		return gettype_time(getContext());
	}

	/**
	 * @param context
	 * @return value of type_time
	 */
	public final java.lang.Long gettype_time(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.type_time.toString());
	}

	/**
	 * Set value of type_time
	 * @param type_time
	 */
	public final void settype_time(java.lang.Long type_time)
	{
		settype_time(getContext(), type_time);
	}

	/**
	 * Set value of type_time
	 * @param context
	 * @param type_time
	 */
	public final void settype_time(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long type_time)
	{
		getMendixObject().setValue(context, MemberNames.type_time.toString(), type_time);
	}

	/**
	 * @return value of name
	 */
	public final java.lang.String getname()
	{
		return getname(getContext());
	}

	/**
	 * @param context
	 * @return value of name
	 */
	public final java.lang.String getname(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.name.toString());
	}

	/**
	 * Set value of name
	 * @param name
	 */
	public final void setname(java.lang.String name)
	{
		setname(getContext(), name);
	}

	/**
	 * Set value of name
	 * @param context
	 * @param name
	 */
	public final void setname(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String name)
	{
		getMendixObject().setValue(context, MemberNames.name.toString(), name);
	}

	/**
	 * @return value of recipe
	 */
	public final java.lang.String getrecipe()
	{
		return getrecipe(getContext());
	}

	/**
	 * @param context
	 * @return value of recipe
	 */
	public final java.lang.String getrecipe(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.recipe.toString());
	}

	/**
	 * Set value of recipe
	 * @param recipe
	 */
	public final void setrecipe(java.lang.String recipe)
	{
		setrecipe(getContext(), recipe);
	}

	/**
	 * Set value of recipe
	 * @param context
	 * @param recipe
	 */
	public final void setrecipe(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String recipe)
	{
		getMendixObject().setValue(context, MemberNames.recipe.toString(), recipe);
	}

	/**
	 * @return value of type_uuid
	 */
	public final java.lang.String gettype_uuid()
	{
		return gettype_uuid(getContext());
	}

	/**
	 * @param context
	 * @return value of type_uuid
	 */
	public final java.lang.String gettype_uuid(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.type_uuid.toString());
	}

	/**
	 * Set value of type_uuid
	 * @param type_uuid
	 */
	public final void settype_uuid(java.lang.String type_uuid)
	{
		settype_uuid(getContext(), type_uuid);
	}

	/**
	 * Set value of type_uuid
	 * @param context
	 * @param type_uuid
	 */
	public final void settype_uuid(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String type_uuid)
	{
		getMendixObject().setValue(context, MemberNames.type_uuid.toString(), type_uuid);
	}

	/**
	 * @return value of type_bigint
	 */
	public final java.lang.Long gettype_bigint()
	{
		return gettype_bigint(getContext());
	}

	/**
	 * @param context
	 * @return value of type_bigint
	 */
	public final java.lang.Long gettype_bigint(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.type_bigint.toString());
	}

	/**
	 * Set value of type_bigint
	 * @param type_bigint
	 */
	public final void settype_bigint(java.lang.Long type_bigint)
	{
		settype_bigint(getContext(), type_bigint);
	}

	/**
	 * Set value of type_bigint
	 * @param context
	 * @param type_bigint
	 */
	public final void settype_bigint(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long type_bigint)
	{
		getMendixObject().setValue(context, MemberNames.type_bigint.toString(), type_bigint);
	}

	/**
	 * @return value of type_tinyint
	 */
	public final java.lang.Integer gettype_tinyint()
	{
		return gettype_tinyint(getContext());
	}

	/**
	 * @param context
	 * @return value of type_tinyint
	 */
	public final java.lang.Integer gettype_tinyint(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.type_tinyint.toString());
	}

	/**
	 * Set value of type_tinyint
	 * @param type_tinyint
	 */
	public final void settype_tinyint(java.lang.Integer type_tinyint)
	{
		settype_tinyint(getContext(), type_tinyint);
	}

	/**
	 * Set value of type_tinyint
	 * @param context
	 * @param type_tinyint
	 */
	public final void settype_tinyint(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer type_tinyint)
	{
		getMendixObject().setValue(context, MemberNames.type_tinyint.toString(), type_tinyint);
	}

	/**
	 * @return value of type_text
	 */
	public final java.lang.String gettype_text()
	{
		return gettype_text(getContext());
	}

	/**
	 * @param context
	 * @return value of type_text
	 */
	public final java.lang.String gettype_text(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.type_text.toString());
	}

	/**
	 * Set value of type_text
	 * @param type_text
	 */
	public final void settype_text(java.lang.String type_text)
	{
		settype_text(getContext(), type_text);
	}

	/**
	 * Set value of type_text
	 * @param context
	 * @param type_text
	 */
	public final void settype_text(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String type_text)
	{
		getMendixObject().setValue(context, MemberNames.type_text.toString(), type_text);
	}

	/**
	 * @return value of ResultObject_Query
	 */
	public final cassandra.proxies.Query getResultObject_Query() throws com.mendix.core.CoreException
	{
		return getResultObject_Query(getContext());
	}

	/**
	 * @param context
	 * @return value of ResultObject_Query
	 */
	public final cassandra.proxies.Query getResultObject_Query(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		cassandra.proxies.Query result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ResultObject_Query.toString());
		if (identifier != null)
			result = cassandra.proxies.Query.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ResultObject_Query
	 * @param resultobject_query
	 */
	public final void setResultObject_Query(cassandra.proxies.Query resultobject_query)
	{
		setResultObject_Query(getContext(), resultobject_query);
	}

	/**
	 * Set value of ResultObject_Query
	 * @param context
	 * @param resultobject_query
	 */
	public final void setResultObject_Query(com.mendix.systemwideinterfaces.core.IContext context, cassandra.proxies.Query resultobject_query)
	{
		if (resultobject_query == null)
			getMendixObject().setValue(context, MemberNames.ResultObject_Query.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ResultObject_Query.toString(), resultobject_query.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return resultObjectMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final cassandra.proxies.ResultObject that = (cassandra.proxies.ResultObject) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "Cassandra.ResultObject";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
