package org.phoenix.wallet.addressManager;

import org.phoenix.passwords.PasswordFailException;
import org.phoenix.wallet.Pair;
import org.phoenix.wallet.keys.KeyManager;
import org.phoenix.wallet.keys.PublicKey;
import org.phoenix.wallet.script.ScriptFunction;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by dragonfly on 3/18/14.
 */
public abstract class AddressManagerAbstract implements AddressManager {
    private List<KeyManager> keys;
    protected LinkedList<Pair<ScriptFunction, Map<Integer, Integer>>> functions;
    private boolean password_protected;

    @Override
    public int get_num_KeyManagers() {
        return keys.size();
    }

    @Override
    public boolean has_private_keys() {
        for(KeyManager key : keys) {
            if(key.has_private_keys()) return true;
        }
        return false;
    }

    @Override
    public boolean password_protected() {
        return password_protected;
    }

    @Override
    public Collection<PublicKey> get_keys() {
        LinkedList<PublicKey> list = new LinkedList<PublicKey>();
        for(KeyManager key : keys) {
            list.addAll(key.get_keys());
        }
        return list;
    }

    @Override
    public void set_password(String pw) throws PasswordFailException {
        for(KeyManager key : keys) {
            key.set_password(pw);
        }
        password_protected = true;
    }

    @Override
    public void unset_password() throws PasswordFailException {
        for(KeyManager key : keys) {
            key.unset_password();
        }
        password_protected = false;
    }
}
