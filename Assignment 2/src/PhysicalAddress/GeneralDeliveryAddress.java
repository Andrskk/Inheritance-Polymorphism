package PhysicalAddress;

import BaseAddress.Address;
import EAddress.TelecomAddress;

//-------------------------------------
// Part: 1
// Written by: Andrei Skachkou 40134189
//-------------------------------------

/**
 * GeneralDeliveryAddress subclass inherited from GeographicAddress class. Contains specific information of GeneralDeliveryAddress
 * object.
 * Overrides equals method to compare two objects and toString method to display object information.
 */
public class GeneralDeliveryAddress extends GeographicAddress {

    //Instance variable initialization

    private TelecomAddress telecomAddress;

    //Default constructor
    public GeneralDeliveryAddress()
    {
        super();
    }

    //Copy constructor
    public GeneralDeliveryAddress(GeneralDeliveryAddress anotherGeneralDeliveryAddress)
    {
        this.telecomAddress=anotherGeneralDeliveryAddress.getTelecomAddress();
    }

    //Parameterized constructor
    public GeneralDeliveryAddress(String validFrom, String validTo, Locale locale,
                                  String addressLine, String city, String regionOrState,
                                  String zipOrPostCode, TelecomAddress telecomAddress)
    {
        super(validFrom,validTo,locale,addressLine,city,regionOrState,zipOrPostCode);
        this.telecomAddress = telecomAddress;
    }

    /**
     * Method to get TelecomAddress.
     * @return telecom address as a TelecomAddress class type.
     */
    public TelecomAddress getTelecomAddress()
    {
        return telecomAddress;
    }

    /**
     * Method to set TelecomAddress.
     * @param telecomAddress Receives a variable of TelecomAddress type and assigns it to "this" telecomAddress.
     */
    public void setTelecomAddress(TelecomAddress telecomAddress)
    {
        this.telecomAddress = telecomAddress;
    }

    /**
     * Overridden equals method to compare two objects of GeneralDeliveryAddress type.
     * @param anotherObject Receives a parameter of class Object, then cast it to GeneralDeliveryAddress type.
     * Compare it with "this" object parameters.
     * @return false, if passing object is null or has a different class type, return true, if all object attributes are
     * equal.
     */
    public boolean equals(Object anotherObject)
    {
        if ((anotherObject!=null)&&(getClass()==anotherObject.getClass()))
        {
            GeneralDeliveryAddress anotherGeneralDeliveryAddress = (GeneralDeliveryAddress) anotherObject;

            return this.telecomAddress.equals(anotherGeneralDeliveryAddress.getTelecomAddress());
        }
        else return false;
    }

    /**
     * Overridden toString method to display an GeneralDeliveryAddress information.
     * @return all GeneralDeliveryAddress information as a String plus obsolete information from a base class.
     */
    public String toString()
    {
        String result="";
        result+="This general delivery address: "+ super.getAddressLine()+" "+super.getCity()+" "
                +super.getRegionOrState()+" "+super.getZipOrPostCode()+" is valid from "+super.validFrom
            +" to "+super.validTo+", therefore ";

        if (super.isObsolete)result+="it is not usable today.";
        else result+="it is still usable today.";
        return result;
    }

    /**
     * Method to display an GeneralDeliveryAddress information.
     * @return all GeneralDeliveryAddress information as a String.
     */
    public String display()
    {
        return "This general delivery address: \n"+getAddressLine()+", "+getCity()+", "+getRegionOrState()
                +", "+getZipOrPostCode();
    }
}
