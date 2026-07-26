package tests;

import utilities.ExcelUtils;

public class ExcelReadTest {

    public static void main(String[] args) {

        String name = ExcelUtils.getCellData("Sheet1", 1, 0);
        String address = ExcelUtils.getCellData("Sheet1", 1, 1);
        String state = ExcelUtils.getCellData("Sheet1", 1, 2);
        String district = ExcelUtils.getCellData("Sheet1", 1, 3);
        String city = ExcelUtils.getCellData("Sheet1", 1, 4);
        String pincode = ExcelUtils.getCellData("Sheet1", 1, 5);
        String primaryPhone = ExcelUtils.getCellData("Sheet1", 1, 6);
        String alternatePhone = ExcelUtils.getCellData("Sheet1", 1, 7);
        String primaryEmail = ExcelUtils.getCellData("Sheet1", 1, 8);
        String alternateEmail = ExcelUtils.getCellData("Sheet1", 1, 9);
        String principalActivity = ExcelUtils.getCellData("Sheet1", 1, 10);
        String category = ExcelUtils.getCellData("Sheet1", 1, 11);
        String institutionType = ExcelUtils.getCellData("Sheet1", 1, 12);
        String officerFirstName = ExcelUtils.getCellData("Sheet1", 1, 13);
        String officerLastName = ExcelUtils.getCellData("Sheet1", 1, 14);
        String designation = ExcelUtils.getCellData("Sheet1", 1, 15);
        String officerEmail = ExcelUtils.getCellData("Sheet1", 1, 16);
        String officerPhone = ExcelUtils.getCellData("Sheet1", 1, 17);
        String officerAddress = ExcelUtils.getCellData("Sheet1", 1, 18);

        System.out.println("Name              : " + name);
        System.out.println("Address           : " + address);
        System.out.println("State             : " + state);
        System.out.println("District          : " + district);
        System.out.println("City              : " + city);
        System.out.println("Pincode           : " + pincode);
        System.out.println("Primary Phone     : " + primaryPhone);
        System.out.println("Alternate Phone   : " + alternatePhone);
        System.out.println("Primary Email     : " + primaryEmail);
        System.out.println("Alternate Email   : " + alternateEmail);
        System.out.println("Principal Activity: " + principalActivity);
        System.out.println("Category          : " + category);
        System.out.println("Institution Type  : " + institutionType);
        System.out.println("Officer FirstName : " + officerFirstName);
        System.out.println("Officer LastName  : " + officerLastName);
        System.out.println("Designation       : " + designation);
        System.out.println("Officer Email     : " + officerEmail);
        System.out.println("Officer Phone     : " + officerPhone);
        System.out.println("Officer Address   : " + officerAddress);
    }
}