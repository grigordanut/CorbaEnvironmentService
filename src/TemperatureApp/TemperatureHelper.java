package TemperatureApp;


/**
* TemperatureApp/TemperatureHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ./Temperature.idl
* 20 August 2021 14:54:56 o'clock IST
*/

abstract public class TemperatureHelper
{
  private static String  _id = "IDL:TemperatureApp/Temperature:1.0";

  public static void insert (org.omg.CORBA.Any a, TemperatureApp.Temperature that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static TemperatureApp.Temperature extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (TemperatureApp.TemperatureHelper.id (), "Temperature");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static TemperatureApp.Temperature read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_TemperatureStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, TemperatureApp.Temperature value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static TemperatureApp.Temperature narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof TemperatureApp.Temperature)
      return (TemperatureApp.Temperature)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      TemperatureApp._TemperatureStub stub = new TemperatureApp._TemperatureStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static TemperatureApp.Temperature unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof TemperatureApp.Temperature)
      return (TemperatureApp.Temperature)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      TemperatureApp._TemperatureStub stub = new TemperatureApp._TemperatureStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
