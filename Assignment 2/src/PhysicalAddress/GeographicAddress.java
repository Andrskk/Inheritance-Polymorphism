package PhysicalAddress;

import BaseAddress.Address;

//-------------------------------------
// Part: 1
// Written by: Andrei Skachkou 40134189
//-------------------------------------

/**
 * GeographicAddress subclass inherited from Address class. Contains specific information of GeographicAddress
 * object.
 * Overrides equals method to compare two objects and toString method to display object information.
 */
public class GeographicAddress extends Address {

    //Instance variable initialization
    private String addressLine;
    private String city;
    private String regionOrState;
    private String zipOrPostCode;
    private Locale locale;

    //Default constructor
    public GeographicAddress()
    {
        super();
    }

    //Copy constructor
    public GeographicAddress(GeographicAddress anotherGeographicAddress)
    {
        this.addressLine=anotherGeographicAddress.getAddressLine();
        this.city=anotherGeographicAddress.getCity();
        this.regionOrState=anotherGeographicAddress.getRegionOrState();
        this.zipOrPostCode=anotherGeographicAddress.getZipOrPostCode();
        this.locale=anotherGeographicAddress.getLocale();
    }

    //Parameterized constructor
    public GeographicAddress(String validFrom, String validTo, String addressLine,
                                  String city, String regionOrState, String zipOrPostCode, Locale locale)
    {
        super(validFrom, validTo);
        this.addressLine = addressLine;
        this.city = city;
        this.regionOrState = regionOrState;
        this.zipOrPostCode = zipOrPostCode;
        this.locale = locale;
    }

    public GeographicAddress(String validFrom, String validTo, Locale locale,String addressLine,
                             String city, String regionOrState, String zipOrPostCode)
    {
        super(validFrom, validTo);
        this.addressLine = addressLine;
        this.city = city;
        this.regionOrState = regionOrState;
        this.zipOrPostCode = zipOrPostCode;
        this.locale = locale;
    }

    /**
     * Method to get address line.
     * @return address line as a String.
     */
    public String getAddressLine()
    {
        return addressLine;
    }

    /**
     * Method to set address line.
     * @param addressLine Receives address line as a String and assigns it to "this" address line.
     */
    public void setAddressLine(String addressLine)
    {
        this.addressLine = addressLine;
    }

    /**
     * Method to get city.
     * @return city as a String.
     */
    public String getCity()
    {
        return city;
    }

    /**
     * Method to set city.
     * @param city Receives city as a String and assigns it to "this" city.
     */
    public void setCity(String city)
    {
        this.city = city;
    }

    /**
     * Method to get a region or state.
     * @return region or state as a String.
     */
    public String getRegionOrState()
    {
        return regionOrState;
    }

    /**
     * Method to set region or state.
     * @param regionOrState Receives a region or state as a String and assigns it to "this" regionOrState.
     */
    public void setRegionOrState(String regionOrState)
    {
        this.regionOrState = regionOrState;
    }

    /**
     * Method to get zip or postcode.
     * @return zip or postcode as a String.
     */
    public String getZipOrPostCode()
    {
        return zipOrPostCode;
    }

    /**
     * Method to set zip or postcode.
     * @param zipOrPostCode Receives a zip or postcode as a String and assigns it to "this" zipOrPostCode.
     */
    public void setZipOrPostCode(String zipOrPostCode)
    {
        this.zipOrPostCode = zipOrPostCode;
    }

    /**
     * Method to get locale.
     * @return locale as a Locale class type.
     */
    public Locale getLocale()
    {
        return locale;
    }

    /**
     * Method to set locale.
     * @param locale Receives a variable of Locale type and assigns it to "this" locale.
     */
    public void setLocale(Locale locale)
    {
        this.locale = locale;
    }

    /**
     * Overridden equals method to compare two objects of GeographicAddress type.
     * @param anotherObject Receives a parameter of class Object, then cast it to GeographicAddress type.
     * Compare it with "this" object parameters.
     * @return false, if passing object is null or has a different class type, return true, if all object attributes are
     * equal.
     */
    public boolean equals(Object anotherObject)
    {
        if ((anotherObject!=null)&&(getClass()==anotherObject.getClass()))
        {
            GeographicAddress anotherGeographicAddress = (GeographicAddress) anotherObject;
            return this.addressLine.equals(anotherGeographicAddress.getAddressLine())
                    &&this.city.equals(anotherGeographicAddress.getCity())
                    &&this.regionOrState.equals(anotherGeographicAddress.getRegionOrState())
                    &&this.zipOrPostCode.equals(anotherGeographicAddress.getZipOrPostCode())
                    &&this.locale.equals(anotherGeographicAddress.getLocale());
        }
        else return false;
    }

    /**
     * Overridden toString method to display an GeographicAddress information.
     * @return all GeographicAddress information as a String plus obsolete information.
     */
    public String toString()
    {
        String result="";
        result+=super.toString()+" geographic address: "+ getAddressLine()+", "+getCity()+", "+getRegionOrState()
                +", "+getZipOrPostCode()+","+getLocale()+" is valid from "+super.validFrom
                +" to "+super.validTo+", therefore ";

        if (super.isObsolete)result+="it is not usable today.";
        else result+="it is still usable today.";
        return result;
    }

    /**
     * Method to display an GeographicAddress information.
     * @return all GeographicAddress information as a String.
     */
    public String display()
    {
        return "This geographic address: \n"+getAddressLine()+", "+getCity()+", "+getRegionOrState()
                +", "+getZipOrPostCode();
    }
}
