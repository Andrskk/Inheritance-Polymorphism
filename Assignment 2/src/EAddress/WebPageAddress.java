package EAddress;

import BaseAddress.Address;

//-------------------------------------
// Part: 1
// Written by: Andrei Skachkou 40134189
//-------------------------------------

/**
 * WebPageAddress subclass inherited from Address class. Contains specific information of WebPageAddress object.
 * Overrides equals method to compare two objects and toString method to display object information.
 */
public class WebPageAddress extends Address {

    //Instance variable initialization
    private String url;

    //Default constructor
    public WebPageAddress()
    {
        super();
    }

    //Copy constructor
    public WebPageAddress(WebPageAddress webPageAddress)
    {
        this.url=webPageAddress.getUrl();
    }

    //Parameterized constructor
    public WebPageAddress(String validFrom, String validTo, String url)
    {
        super(validFrom, validTo);
        this.url = url;
    }

    /**
     * Method to get Uniform Resource Locator(URL).
     * @return URL as a String
     */
    public String getUrl()
    {
        return url;
    }

    /**
     * Method to set URL.
     * @param url Receives URL as a String and assigns it to "this" URL.
     */
    public void setUrl(String url)
    {
        this.url = url;
    }

    /**
     * Overridden equals method to compare two objects of WebPageAddress type.
     * @param anotherObject Receives a parameter of class Object, then cast it to WebPageAddress type. Compare it with "this"
     * object parameters.
     * @return false, if passing object is null or has a different class type, return true, if all object attributes are
     * equal.
     */
    public boolean equals(Object anotherObject)
    {
        if ((anotherObject!=null)&&(getClass()==anotherObject.getClass()))
        {
            WebPageAddress anotherWebPageAddress = (WebPageAddress) anotherObject;
            return this.url.equals(anotherWebPageAddress.getUrl());
        }
        else return false;
    }

    /**
     * Overridden toString method to display an WebPageAddress information.
     * @return all WebPageAddress information as a String plus obsolete information.
     */
    public String toString()
    {
        String result="";
        result+=super.toString()+" webpage address: "+getUrl()+" is valid from "+super.validFrom
                +" to "+super.validTo+", therefore ";

        if (super.isObsolete)result+="it is not usable today.";
        else result+="it is still usable today.";
        return result;
    }

    /**
     * Method to display an WebPageAddress information.
     * @return all WebPageAddress information as a String.
     */
    public String display()
    {
        return "This webpage address: \n"+ getUrl();
    }
}