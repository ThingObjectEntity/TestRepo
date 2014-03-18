package org.phoenix.wallet.addressManager;

import org.phoenix.wallet.keys.KeyManager;
import org.phoenix.wallet.script.ScriptFunction;

import java.util.Collection;
import java.util.Map;

/**
 * Created by dragonfly on 3/18/14.
 *
 * Contains one or more key managers and manages precomputed strings for them
 * which can be used to recognize transactions that it can sign.
 */
public interface AddressManager extends KeyManager{
    public int get_num_KeyManagers();
    public Collection<String> get_addresses();
}
