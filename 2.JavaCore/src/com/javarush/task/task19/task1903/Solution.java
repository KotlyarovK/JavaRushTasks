package com.javarush.task.task19.task1903;

/* 
Адаптация нескольких интерфейсов
*/

import javax.swing.text.MaskFormatter;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<String, String> countries = new HashMap<String, String>();
    static {
        countries.put("UA","Ukraine");
        countries.put("RU","Russia");
        countries.put("CA","Canada");
    }

    public static void main(String[] args) {

    }

    public static class IncomeDataAdapter implements Customer, Contact {
        private IncomeData data;

        public IncomeDataAdapter(IncomeData incomeData) {
            this.data = incomeData;
        }



        @Override
        public String getCompanyName() {
            return data.getCompany();
        }

        @Override
        public String getCountryName() {
            return countries.get(data.getCountryCode());
        }

        @Override
        public String getName() {
            return data.getContactLastName() + ", " + data.getContactFirstName();
        }

        @Override
        public String getPhoneNumber() {
            StringBuilder phone =new StringBuilder();
            //phone.append(data.getCountryCode());
            String temp = String.valueOf(data.getPhoneNumber());
            if (temp.length()<10) {
                for (int i = temp.length(); i < 10; i++) {
                    phone.append("0");
                }
            }

            phone.append(temp);

            try {
                MaskFormatter format = new MaskFormatter("(###)###-##-##");
                format.setValueContainsLiteralCharacters(false);
                temp = format.valueToString(phone.toString());

            } catch (ParseException e) {
                e.printStackTrace();
            }

            return "+" +data.getCountryPhoneCode() + temp;
        }
    }


    public static interface IncomeData {
        String getCountryCode();        //example UA

        String getCompany();            //example JavaRush Ltd.

        String getContactFirstName();   //example Ivan

        String getContactLastName();    //example Ivanov

        int getCountryPhoneCode();      //example 38

        int getPhoneNumber();           //example 501234567
    }

    public static interface Customer {
        String getCompanyName();        //example JavaRush Ltd.

        String getCountryName();        //example Ukraine
    }

    public static interface Contact {
        String getName();               //example Ivanov, Ivan

        String getPhoneNumber();        //example +38(050)123-45-67
    }
}