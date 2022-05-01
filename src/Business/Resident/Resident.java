/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Resident;

import Business.Network.Network;
import javax.swing.ImageIcon;

/**
 *
 * @author vivek
 */
public class Resident {
    
     private String name;
    private int age;
    private String sex;
    private String address;
    private String email;
    private String phone;
    private String idType;
    private String id;
    private String userName;
    private String password;
    private String filename;
    private ImageIcon idProof;
    private Network network;
    
    public Resident(String name, int age, String sex, String address, String email, String phone, String idType, String id, String userName, String password, Network network) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.network = network;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public ImageIcon getIdProof() {
        return idProof;
    }

    public void setIdProof(ImageIcon idProof) {
        this.idProof = idProof;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }
    
    
}
