/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myadapter;

import java.util.List;
import nfzManagers.IValidInformation;

/**
 *
 * @author student
 */
public class NFZValidInformationAdapter implements INFZValidInformationAdapter {
    
    private IValidInformation _validInformation;

    @Override
    public String[] GetRefundedListOfDrugs() {
        return (String[]) _validInformation.GetRefundedListOfDrugs().toArray();
    }

    @Override
    public String[] GeListOfMedicalFacility(String string) {
        return _validInformation.GeListOfMedicalFacility(string);
    }
    
    public NFZValidInformationAdapter(IValidInformation vi) {
        _validInformation = vi;
    }
}
