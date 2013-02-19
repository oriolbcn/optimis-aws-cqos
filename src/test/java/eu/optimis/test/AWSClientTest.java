package eu.optimis.test;

import com.amazonaws.services.ec2.AmazonEC2;
import eu.optimis.interopt.provider.ServiceComponent;
import eu.optimis.interopt.provider.ServiceInstantiationException;
import eu.optimis.interopt.provider.VMProperties;
import eu.optimis.interopt.provider.aws.AmazonClient;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;

import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.net.UnknownServiceException;
import java.util.List;
import java.util.Vector;
import org.junit.Ignore;

public class AWSClientTest extends TestCase
{

    private static String AWS_PUBLIC_KEY = "AKIAJU57M324DUE4MIJQ";
    private static String AWS_SECRET_KEY = "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";
    private static String SERVICE_ID = "d3f64f3f-c57b-460c-97d4-9b84c576c397"; //Random service id for testing
    private static String VM_IMAGE = "ami-937474e7";

    @Before
    protected void setUp() throws Exception
    {
        super.setUp();
    }

    @After
    protected void tearDown() throws Exception
    {
        super.tearDown();
    }

    /**
     * Tests the implementation of the AWS client in order to deploy a new service, get monitoring
     * information for the service and finally terminate the service in the AWS backend.
     */
    @Ignore
    public void testDefaultAllocationWorkflow()
    {

    }
}
