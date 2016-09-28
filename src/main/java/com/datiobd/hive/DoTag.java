package com.datiobd.hive;

import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;

public class DoTag extends UDF {

	public Text evaluate(Text input) {
		return (input != null) ? new Text("<" + input.toString().trim().toLowerCase() + ">"): null;
	}
}
