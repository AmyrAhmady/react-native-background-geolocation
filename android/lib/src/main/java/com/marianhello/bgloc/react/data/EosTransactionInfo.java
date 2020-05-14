package com.marianhello.bgloc.react.data;

public class EosTransactionInfo {
    private String contract;
    private String action;
    private String permissionAccount;
    private String permissionType;
    private String privateKey;

    public EosTransactionInfo(String contract, String action, String permissionAccount, String permissionType, String privateKey) {
        this.contract = contract;
        this.action = action;
        this.permissionAccount = permissionAccount;
        this.permissionType = permissionType;
        this.privateKey = privateKey;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getContract() {
        return contract;
    }

    public void setContract(String contract) {
        this.contract = contract;
    }

    public String getPermissionAccount() {
        return permissionAccount;
    }

    public void setPermissionAccount(String permissionAccount) {
        this.permissionAccount = permissionAccount;
    }

    public String getPermissionType() {
        return permissionType;
    }

    public void setPermissionType(String permissionType) {
        this.permissionType = permissionType;
    }

    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }
}
