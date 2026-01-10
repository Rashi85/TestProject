package d_testJunit;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.*;  
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.*; 

class hamcrestdemo {

	@Test
	public void test() {
		String a = "foo";
        String b = "FOO";
        assertThat
        (a, equalToIgnoringCase(b));
	}

}
