package EAddress;

import BaseAddress.Address;

//-------------------------------------
// Part: 1
// Written by: Andrei Skachkou 40134189
//-------------------------------------

/**
 * TelecomAddress subclass inherited from Address class. Contains specific information of TelecomAddress object.
 * Overrides equals method to compare two objects and toString method to display object information.
 */
public class TelecomAddress extends Address {

    //Instance variables initialization
    private String idd;
    private String ndd;
    private int areaCode;
    private long number;
    private int extension;
    private String physicalType;

    //Default constructor
    public TelecomAddress()
    {
        super();
    }

    //Copy constructor
    public TelecomAddress(TelecomAddress anotherTelecomAddress)
    {
        this.idd=anotherTelecomAddress.getIdd();
        this.ndd=anotherTelecomAddress.getNdd();
        this.areaCode=anotherTelecomAddress.getAreaCode();
        this.number=anotherTelecomAddress.getNumber();
        this.extension=anotherTelecomAddress.getExtension();
        this.physicalType=anotherTelecomAddress.getPhysicalType();

    }
    //Parameterized constructor
    public TelecomAddress(String validFrom, String validTo, String idd, String ndd,
                          int areaCode, long number, int extension, String physicalType)
    {
        super(validFrom, validTo);
        this.idd = idd;
        this.ndd = ndd;
        this.areaCode = areaCode;
        this.number = number;
        this.extension = extension;
        this.physicalType = physicalType;
    }

    /**
     * Method to get International Direct Dialing prefix(IDD).
     * @return IDD as a String
     */
    public String getIdd()
    {
        return idd;
    }

    /**
     * Method to set IDD.
     * @param idd Receives IDD as a String and assigns it to "this" IDD.
     */
    public void setIdd(String idd)
    {
        this.idd = idd;
    }

    /**
     * Method to get National Direct Dialing prefix(NDD).
     * @return NDD as a String
     */
    public String getNdd()
    {
        return ndd;
    }

    /**
     * Method to set NDD.
     * @param ndd Receives NDD as a String and assigns it to "this" NDD.
     */
    public void setNdd(String ndd)
    {
        this.ndd = ndd;
    }

    /**
     * Method to get area code.
     * @return area code as an integer.
     */
    public int getAreaCode()
    {
        return areaCode;
    }

    /**
     * Method to set area code.
     * @param areaCode Receives an area code as an integer and assigns it to "this" areaCode.
     */
    public void setAreaCode(int areaCode)
    {
        this.areaCode = areaCode;
    }

    /**
     * Method to get number.
     * @return number as a long.
     */
    public long getNumber()
    {
        return number;
    }

    /**
     * Method to set number.
     * @param number Receives a number as a long and assigns it to "this" number.
     */
    public void setNumber(long number)
    {
        this.number = number;
    }

    /**
     * Method to get extension.
     * @return extension as an integer.
     */
    public int getExtension()
    {
        return extension;
    }

    /**
     * Method to set extension.
     * @param extension Receives an extension as an integer and assigns it to "this" extension.
     */
    public void setExtension(int extension)
    {
        this.extension = extension;
    }

    /**
     * Method to get physicalType.
     * @return physicalType as a String.
     */
    public String getPhysicalType()
    {
        return physicalType;
    }

    /**
     * Method to set physicalType.
     * @param physicalType Receives an physicalType as a String and assigns it to "this" physicalType.
     */
    public void setPhysicalType(String physicalType)
    {
        this.physicalType = physicalType;
    }

    /**
     * Overridden equals method to compare two objects of TelecomAddress type.
     * @param anotherObject Receives a parameter of class Object, then cast it to TelecomAddress type. Compare it with "this"
     * object parameters.
     * @return false, if passing object is null or has a different class type, return true, if all object attributes are
     * equal.
     */
    public boolean equals(Object anotherObject)
    {
        if ((anotherObject!=null)&&(getClass()==anotherObject.getClass()))
        {
            TelecomAddress anotherTelecomAddress = (TelecomAddress) anotherObject;
            return this.idd.equals(anotherTelecomAddress.getIdd())
                    &&this.ndd.equals(anotherTelecomAddress.getNdd())
                    &&this.areaCode==(anotherTelecomAddress.getAreaCode())
                    &&this.number==(anotherTelecomAddress.getNumber())
                    &&this.extension==(anotherTelecomAddress.getExtension())
                    &&this.physicalType.equals(anotherTelecomAddress.getPhysicalType());
        }
        else return false;
    }

    /**
     * Overridden toString method to display an TelecomAddress information.
     * @return all TelecomAddress information as a String plus obsolete information.
     */
    public String toString()
    {
        String result="";
        result+=super.toString()+" telecom address: "+ getIdd()+"("+getNdd()+")"+getAreaCode()+" "+getNumber()+" "
                +"ext. "+getExtension()+" "+getPhysicalType()+" "+super.validFrom
                +" to "+super.validTo+", therefore ";

        if (super.isObsolete)result+="it is not usable today.";
        else result+="it is still usable today.";
        return result;

    }

    /**
     * Method to display an TelecomAddress information.
     * @return all TelecomAddress information as a String.
     */
    public String display()
    {
        return "Telecom address: \n+"+ getIdd()+"("+getNdd()+")"+getAreaCode()+" "+getNumber()+" "
                +"ext. "+getExtension()+" "+getPhysicalType();
    }
}