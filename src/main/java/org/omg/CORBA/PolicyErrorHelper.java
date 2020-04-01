package org.omg.CORBA;


/**
* org/omg/CORBA/PolicyErrorHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-owindows-i586-cygwin/jdk8u40/2855/corba/src/share/classes/org/omg/PortableInterceptor/CORBAX.idl
* Tuesday, February 10, 2015 10:07:59 PM PST
*/


/**
   * Thrown to indicate problems with parameter values passed to the
   * <code>ORB.create_policy</code> operation.  
   */
abstract public class PolicyErrorHelper
{
  private static String  _id = "IDL:omg.org/CORBA/PolicyError:1.0";

  public static void insert (org.omg.CORBA.Any a, org.omg.CORBA.PolicyError that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static org.omg.CORBA.PolicyError extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  private static boolean __active = false;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      synchronized (org.omg.CORBA.TypeCode.class)
      {
        if (__typeCode == null)
        {
          if (__active)
          {
            return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
          }
          __active = true;
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [1];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_short);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (org.omg.CORBA.PolicyErrorCodeHelper.id (), "PolicyErrorCode", _tcOf_members0);
          _members0[0] = new org.omg.CORBA.StructMember (
            "reason",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_exception_tc (org.omg.CORBA.PolicyErrorHelper.id (), "PolicyError", _members0);
          __active = false;
        }
      }
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static org.omg.CORBA.PolicyError read (org.omg.CORBA.portable.InputStream istream)
  {
    org.omg.CORBA.PolicyError value = new org.omg.CORBA.PolicyError ();
    // read and discard the repository ID
    istream.read_string ();
    value.reason = istream.read_short ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, org.omg.CORBA.PolicyError value)
  {
    // write the repository ID
    ostream.write_string (id ());
    ostream.write_short (value.reason);
  }

}
