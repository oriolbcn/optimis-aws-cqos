package eu.optimis.interopt.provider;

import java.util.HashMap;
import java.util.Map;

public class VMProperties extends HashMap<String, String>
    implements Map<String, String>
{
    private static final long serialVersionUID = 1L;

    private String id;
    private String status;
    private String hostname;
    private String ip;

    public static final String AWS_INSTANCE_TYPE = "com.amazon.aws.instance.type";

    /**
     * Returns the id of a particular VM instance.
     * 
     * @return the id of the VM instance
     */
    public String getId()
    {
        return id;
    }

    /**
     * Sets the id of a VM instance.
     * 
     * @param id
     *            the VM id
     */
    public void setId( String id )
    {
        this.id = id;
    }

    /**
     * Retrieves the status of a VM. The status should be compliant to the states as defined by the OCCI
     * specification.
     * 
     * @return VM status
     */
    public String getStatus()
    {
        return status;
    }

    /**
     * Sets the status of a VM. The status should be compliant to the states as defined by the OCCI
     * specification.
     * 
     * @param status
     *            the VM status.
     */
    public void setStatus( String status )
    {
        this.status = status;
    }
    
    public String getHostname() {
        return this.hostname;
    }
    
    public void setHostname(String hostname) {
        this.hostname = hostname;
    }
    
    public String getIp() {
        return this.ip;
    }
    
    public void setIp(String ip) {
        this.ip = ip;
    }

}
