/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myadapter;

import nfzManagers.IValidInformation;
import nfzModel.ValidInformation;

/**
 *
 * @author LeopardProMK
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Client client = null;

        /* Anti-pattern  */
        ValidInformation info1 = new ValidInformation();
        client = new Client(info1);

        /* vs */
        
        /* Adapter */
        //...
        IValidInformation vi = new ValidInformation();
        INFZValidInformationAdapter adapt = new NFZValidInformationAdapter(vi);
        
        /* System */
        client.DoSomethingImportant1();
        client.DoSomethingImportant2();
        client.DoSomethingImportant3();
        client.DoSomethingImportant4();
        client.DoSomethingImportant5();
    }

    private ValidInformation info = null;

    public Client(ValidInformation info) {
        this.info = info;
    }
    
    public void DoSomethingImportant1() {
        String[] medicalFacility = info.GeListOfMedicalFacility();
        String[] listOfDrugs = info.GetRefundedListOfDrugs();
    }

    public void DoSomethingImportant2() {
        String[] medicalFacility = info.GeListOfMedicalFacility();
        String[] listOfDrugs = info.GetRefundedListOfDrugs();
    }

    public void DoSomethingImportant3() {
        String[] medicalFacility = info.GeListOfMedicalFacility();
        String[] listOfDrugs = info.GetRefundedListOfDrugs();
    }

    public void DoSomethingImportant4() {
        String[] medicalFacility = info.GeListOfMedicalFacility();
        String[] listOfDrugs = info.GetRefundedListOfDrugs();
    }

    public void DoSomethingImportant5() {
        String[] medicalFacility = info.GeListOfMedicalFacility();
        String[] listOfDrugs = info.GetRefundedListOfDrugs();
    }
}
