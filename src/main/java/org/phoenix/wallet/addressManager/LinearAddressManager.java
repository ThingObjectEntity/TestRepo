package org.phoenix.wallet.addressManager;

import org.phoenix.passwords.PasswordFailException;
import org.phoenix.wallet.keys.Keypair;
import org.phoenix.wallet.keys.LinearKeyManager;
import org.phoenix.wallet.keys.PublicKey;
import org.phoenix.wallet.keys.SequentialKeyManager;

/**
 * Created by dragonfly on 3/18/14.
 */
public interface LinearAddressManager extends AddressManager {
    public Iterable<PublicKey> latest();
    public void generate_next();
    public SequentialKeyManager export_SequentialKeyManager(int manager);
    public PublicKey get_PublicKey(int manager, int n);
    public Keypair get_PrivateKey(int manager, int n) throws PasswordFailException;
    public LinearKeyManager export_LinearKeyManager(int manager, int n);
    public LinearAddressManager export_LinearAddressManager(int n);
}
