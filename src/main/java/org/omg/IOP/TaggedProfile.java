package org.omg.IOP;


/**
* org/omg/IOP/TaggedProfile.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-owindows-i586-cygwin/jdk8u40/2855/corba/src/share/classes/org/omg/PortableInterceptor/IOP.idl
* Tuesday, February 10, 2015 10:08:00 PM PST
*/

public final class TaggedProfile implements org.omg.CORBA.portable.IDLEntity
{

  /** The tag, represented as a profile id. */
  public int tag = (int)0;

  /** The associated profile data. */
  public byte profile_data[] = null;

  public TaggedProfile ()
  {
  } // ctor

  public TaggedProfile (int _tag, byte[] _profile_data)
  {
    tag = _tag;
    profile_data = _profile_data;
  } // ctor

} // class TaggedProfile
