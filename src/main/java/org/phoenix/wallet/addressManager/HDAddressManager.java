package org.phoenix.wallet.addressManager;

import org.phoenix.passwords.PasswordFailException;
import org.phoenix.wallet.keys.HDKeyManager;
import org.phoenix.wallet.keys.Keypair;
import org.phoenix.wallet.keys.PublicKey;

/**
 * Created by dragonfly on 3/18/14.
 */
public interface HDAddressManager extends AddressManager{
    public PublicKey get_PublicKey(int manager, int[] n);
    public Keypair get_PrivateKey(int manager, int[] n) throws PasswordFailException;
    public HDAddressManager export_HDManager(int[] n);
    public HDAddressManager export_private_HDManager(int[] n) throws PasswordFailException;
    public HDKeyManager export_HDManager(int manager, int[] n);
    public HDKeyManager export_private_HDManager(int manager, int[] n) throws PasswordFailException;
}
