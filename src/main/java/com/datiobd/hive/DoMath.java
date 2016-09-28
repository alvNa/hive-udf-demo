package com.datiobd.hive;

import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;

public class DoMath extends UDF {

    public Text evaluate(Text input) {
        Double result = 0D;

        if (input != null) {
            Double d = 0D;
            try {
                d = Double.valueOf(input.toString());
            } catch (NumberFormatException e) {

            }
            result = Math.exp(d) - Math.floor(d);
        }

        return new Text(result.toString());
    }
}
