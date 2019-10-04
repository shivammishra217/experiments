package Test;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Shivam Mishra on 31 Aug .
 **/
public class MapTest {

    public static void main(String[] args) {


        /**
         *  -- Hashtable
         *
         *  - Key and value should be not null.
         *
         *  - To successfully store and retrieve objects from a hashtable, the
         *    objects used as keys must implement the <code>hashCode</code>
         *    method and the <code>equals</code> method.
         *
         *  - An instance of <code>Hashtable</code> has two parameters that affect its
         *    performance: <i>initial capacity</i> and <i>load factor</i>.  The
         *    <i>capacity</i> is the number of <i>buckets</i> in the hash table, and the
         *    <i>initial capacity</i> is simply the capacity at the time the hash table
         *    is created.
         *
         *
         *  - Hashtable is synchronized
         *
         *  - fail-fast behavior -  if the Hashtable is structurally modified at any time
         *  after the iterator is created, in any way except through the iterator's own
         *  <tt>remove</tt> method, the iterator will throw a ConcurrentModificationException.
         *
         *
         *
         */
        Hashtable<String,String> hashtable = new Hashtable<>();

        /**
         * -- HashMap
         * -- The HashMap class is roughly equivalent to Hashtable , except that it is unsynchronized and permits nulls values and keys.
         *
         * - Hash table based implementation of the Map interface.
         * - It permits null values and null keys.
         * - This class makes no guarantees as to the order of the map; in particular, it does not guarantee that the order will remain constant over time.
         *
         * - Implementation Notes :
         * - This map usually acts as a binned (bucketed) hash table, but
         *   when bins get too large, they are transformed into bins of
         *   TreeNodes, each structured similarly to those in java.util.TreeMap.
         */

        HashMap<String,String> hashMap = new HashMap<>();

        /**
         * -- TreeMap
         * - A Red-Black tree based implementation.
         * - The map is sorted according to the {@linkplain Comparable natural ordering} of its keys,
         * or by a {@link Comparator} provided at map creation time, depending on which constructor is used.
         *
         * - this implementation is not synchronized
         * - fail-fast
         */

        TreeMap<String,String> treeMap = new TreeMap<>();




    }
}
