package Driver;

import BaseAddress.Address;
import EAddress.EmailAddress;
import EAddress.TelecomAddress;
import EAddress.WebPageAddress;
import PhysicalAddress.GeneralDeliveryAddress;
import PhysicalAddress.GeographicAddress;
import PhysicalAddress.Locale;
import PhysicalAddress.PostOfficeBoxAddress;
//-------------------------------------
// Assignment 2 due to March 05, 2021
// Written by: Andrei Skachkou 40134189
// Comp 249
// The program consists of several subclasses that derived from a base Class called Address. The base Class provides
// a date limits each address is valid in. If an address falls out of these date than it's obsolete address.
// In driver Class it creates a bunch of different subclass Objects to use Inheritance and Polymorphism.
// The driver Class also has a copyAddress method to copy an array of Addresses and traceObsoleteAddress method that
// checks whether an address is obsolete or not.
//-------------------------------------
/**
 * Driver class for program test.
 */
public class Driver {
    /**
     * Method to copy array of addresses.
     * @param array Receives an array of addresses.
     * @return a copy of receiving array of type Address.
     */
    public static Address[] copyAddresses(Address[] array)
    {
        Address[] tempAddressesArray = new Address[array.length];

        for (int i=0;i<tempAddressesArray.length;i++)
        {
            tempAddressesArray[i]=new Address(array[i]);
        }
        return tempAddressesArray;
    }
    /**
     * main() method for the driver program.
     * Creates address Objects, stores them into array, displays information of each of them, tests some for equality,
     * creates a copy of existing array and shows if it's correct
     * @param args stores incoming command argument for the program.
     */
    public static void main(String[] args)
    {
        // Different address Objects instantiation
        EmailAddress emailAddress = new EmailAddress("2020-10-18","2022-01-01","Andrei Skachkou",
                "gmail","com");
        EmailAddress emailAddress1 = new EmailAddress("2020-10-18","2022-01-01","John Smith",
                "gmail","com");
        TelecomAddress telecomAddress = new TelecomAddress("2020-10-18","2022-02-27","1","0",
                208,1234567,789,"mobile");
        WebPageAddress webPageAddress = new WebPageAddress("1998-01-01","2000-01-01","www.abc.com");
        GeneralDeliveryAddress generalDeliveryAddress = new GeneralDeliveryAddress("2025-01-01","2029-03-01",new Locale
                ("CA",124,"Canada"),"1111, Saint-Catherine E street","Monteral",
                "QC","H1W7R1",new TelecomAddress("2000-01-01","2000-02-01","1",
                "0",301,1987855,888,"mobile"));
        GeneralDeliveryAddress generalDeliveryAddress1 = new GeneralDeliveryAddress("1974-01-01","2021-03-01",new Locale
                ("CA",124,"Canada"),"1111, Saint-Catherine E street","Monteral",
                "QC","H1W7R1",new TelecomAddress("2000-01-01","2000-02-01","+1",
                "0",301,1987855,888,"mobile"));
        GeneralDeliveryAddress generalDeliveryAddress2 = new GeneralDeliveryAddress("1974-01-01","2021-03-01",new Locale
                ("CA",124,"Canada"),"1111, Saint-Catherine E street","Monteral",
                "QC","H1W7R1",new TelecomAddress("2000-01-01","2000-02-01","+1",
                "0",301,1987855,888,"mobile"));
        GeographicAddress geographicAddress= new GeographicAddress("2025-01-01","2026-01-03",
                "2222 Guy street","Montreal","QC","H9PE3T",new Locale("CA"
        ,124,"\"Canada\""));
        PostOfficeBoxAddress postOfficeBoxAddress = new PostOfficeBoxAddress("1990-01-01","2001-09-08",
                "3026 Notre-Dame St W street","Montreal","QC","H1R1W1",
                new Locale("CA",124,"Canada"),2425);
       PostOfficeBoxAddress postOfficeBoxAddress1 = new PostOfficeBoxAddress("1990-01-01","2001-09-08",
               "3026 Notre-Dame St W street","Montreal","QC","H1R1W1",
               new Locale("CA",124,"Canada"),2425);

        //Display 6 different addresses information
        System.out.println("\n*************** Displaying all 6 classes information ****************");
        System.out.println("\n"+emailAddress+"\n");
        System.out.println("\n"+telecomAddress+"\n");
        System.out.println("\n"+webPageAddress+"\n");
        System.out.println("\n"+generalDeliveryAddress+"\n");
        System.out.println("\n"+geographicAddress+"\n");
        System.out.println("\n"+postOfficeBoxAddress+"\n");
        System.out.println("************************************************************************\n");

        // Testing some address Objects for equality to show equals method
        System.out.println("Testing some Objects for equality: ");

        System.out.println("Object postOfficeBoxAddress and postOfficeBoxAddress1 are equal -> "+
                postOfficeBoxAddress.equals(postOfficeBoxAddress1));

        System.out.println("Object emailAddress and emailAddress1 are equal -> "+
                emailAddress.equals(emailAddress1));

        System.out.println("Object generalDeliveryAddress and generalDeliveryAddress1 are equal -> "+
                generalDeliveryAddress.equals(generalDeliveryAddress1));

        System.out.println("Object generalDeliveryAddress1 and generalDeliveryAddress2 are equal -> "+
                generalDeliveryAddress1.equals(generalDeliveryAddress2));

        // array of addresses initialization
        Address[] addresses = new Address[16];

        // Adding some address Objects and storing them into array
        addresses[0]=emailAddress;addresses[1]=emailAddress1;addresses[2]=telecomAddress;addresses[3]=webPageAddress;
        addresses[4]=generalDeliveryAddress;addresses[5]=generalDeliveryAddress1;addresses[6]=generalDeliveryAddress2;
        addresses[7]=geographicAddress;addresses[8]=postOfficeBoxAddress;addresses[9]=postOfficeBoxAddress1;

        addresses[10]=new EmailAddress("2020-10-18","2022-01-01","Cristiano Ronaldo",
                "gmail","com");
        addresses[11]=new TelecomAddress("1980-10-18","2054-02-27","1","0",
                555,7775557,991,"mobile");
        addresses[12]=new WebPageAddress("1998-01-01","2000-01-01","www.Ronaldo.com");
        addresses[13]=new GeneralDeliveryAddress("1974-01-01","2021-03-01",new Locale
                ("CA",124,"Canada"),"1111, Saint-Catherine E street","Monteral",
                "QC","H1W7R1",new TelecomAddress("2000-01-01","2000-02-01","+1",
                "0",301,1987855,888,"mobile"));
        addresses[14]=new GeographicAddress("2028-01-01","2029-01-03",
                "1515 Guy street","Montreal","QC","H7PE9T",new Locale("CA"
                ,124,"\"Canada\""));
        addresses[15]=new PostOfficeBoxAddress("2020-01-01","2044-09-08",
                "4331 Notre-Dame St W street","Montreal","QC","H5R0W3",
                new Locale("CA",124,"Canada"),2425);
        System.out.println("\n************************************************************************\n");

        // calling method to displays obsolete addresses in comparison the passing date
        traceObsoleteAddress(addresses,2021,02,05);

        // copy array of addresses initialization
        Object[]copiedAddresses;
        // invoking copyAddresses method to make a copy of existing array
        copiedAddresses=copyAddresses(addresses);

        // Output of copy array
        System.out.println("*********** A copy of array is shown below *******************");
        for (int i=0;i< addresses.length;i++)
        {
            System.out.println(copiedAddresses[i]);
        }
        System.out.println("\nComments:\ncopyAddresses method does not work properly, because addresses array contains objects" +
                        " from derived classes of Address.\nThe copy is a plain address, not a true" +
                " copy. The correct way to make a true copy is by using clone() method, which would use Objects copy constructors."+
                "\n\n*********** The program has terminated *******************");
    }

    /**
     * Method to displays obsolete addresses according to passing date.
     * @param array Receives array of addresses.
     * @param year Receives a year as an integer.
     * @param month Receives a month as an integer.
     * @param day Receives a day as an integer.
     */
    public static void traceObsoleteAddress(Address [] array, int year, int month, int day)
    {
        System.out.println("Displaying addresses that are/were obsolete" + " in comparison the date " +
                ""+year+"/"+month+"/"+day);
        System.out.println();
        // loop for verify whether an address is obsolete or not and display a message accordingly
        for (int i=0;i< array.length;i++)
        {
            //Changing obsolete status according to passing date
            array[i].setObsolete(year,month,day);
            if (array[i].isObsolete(year,month,day))
            {
                System.out.println(array[i].display()+" is obsolete");
                System.out.println("index in the array: "+i);
                System.out.println("--------------------------");
            }
        }
    }
}
