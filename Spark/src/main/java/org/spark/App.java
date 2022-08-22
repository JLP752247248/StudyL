package org.spark;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.junit.Test;


/**
 * Hello world!
 *
 */
public class App {

    @Test
    public void testMyCounter() {

    }

}
class Transformations {

    public long myCounter(Dataset<Row> df){
        return df.count();
    }

}

