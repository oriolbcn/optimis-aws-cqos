/* 
 * Copyright (c) 2012, Fraunhofer-Gesellschaft
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 * 
 * (1) Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the disclaimer at the end.
 *     Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in
 *     the documentation and/or other materials provided with the
 *     distribution.
 * 
 * (2) Neither the name of Fraunhofer nor the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 * 
 * DISCLAIMER
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
 * OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *  
 */
package eu.optimis.interopt.provider;

/**
 * A service component specifies the number of instances, CPU speed, memory, etc. of the VMs that should be
 * allocated for a component. It is a name value map that specifies the type (key) and the value (value) of
 * the component properties. The property names rely (as far as possible) on the OCCI specification. The
 * following properties are defined:
 * <ul>
 * <li>occi.compute.architecture</li>
 * <li>occi.compute.speed</li>
 * <li>occi.compute.memory</li>
 * <li>occi.compute.cores</li>
 * <li>eu.optimis.vm.image</li>
 * <li>eu.optimis.vm.contextualization.${instance-id} - the URI of the contextualization image for each VM
 * instance. The instance id is hereby a loop variable from 1..n, where n is the number of instances that
 * should be allocated (i.e. if n=2 there will be two properties - eu.optimis.vm.contextualization.1 and
 * eu.optimis.vm.contextualization.2).</li>
 * </ul>
 * All of the above mentioned properties must be specified for a component.
 * 
 * @author owaeld
 * 
 */
public class ServiceComponent
{
    // occi.compute
    private String architecture;
    private double speed;
    private double memory;
    private int cores;
    
    // optimis.occi
    private String image;
    private int instances;

    public String getArchitecture() {
        return architecture;
    }

    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getMemory() {
        return memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getInstances() {
        return instances;
    }

    public void setInstances(int instances) {
        this.instances = instances;
    }
}
