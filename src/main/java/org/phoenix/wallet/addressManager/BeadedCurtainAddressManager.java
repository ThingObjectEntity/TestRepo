package org.phoenix.wallet.addressManager;

import org.phoenix.passwords.PasswordFailException;
import org.phoenix.wallet.keys.*;

/**
 * Created by dragonfly on 3/18/14.
 */
public interface BeadedCurtainAddressManager extends AddressManager {
    public PublicKey get_PublicKey(int manager, int n, int m);
    public Keypair get_PrivateKey(int manager, int n, int m) throws PasswordFailException;
    public BeadedCurtainKeyManager export_BeadedCurtainKeyManager(int manager);
    public BeadedCurtainKeyManager export_private_BeadedCurtainKeyManager(int manager) throws PasswordFailException;
    public BeadedCurtainKeyManager export_BeadedCurtainAddressManager();
    public BeadedCurtainKeyManager export_private_BeadedCurtainAddressManager() throws PasswordFailException;
    public LinearKeyManager export_LinearKeyManager();
    public LinearKeyManager export_private_LinearKeyManager() throws PasswordFailException;
    public LinearKeyManager export_LinearKeyManager(int n);
    public LinearKeyManager export_private_LinearKeyManager(int n) throws PasswordFailException;
    public int length();
    public int chain_length(int n);
    public SequentialKeyManager export_SequentialKeyManager(int n, int m);
}
