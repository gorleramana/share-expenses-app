package com.rg.ds.arrays;

/**
 * @author gorle
 * Design a data structure that follows the constraints of a Least Recently Used (LRU) cache.
 *
 * Implement the LRUCache class:
 *
 * LRUCache(int capacity) Initialize the LRU cache with positive size capacity.
 * int get(int key) Return the value of the key if the key exists, otherwise return -1.
 * void put(int key, int value) Update the value of the key if the key exists. Otherwise, add the key-value pair to the cache. If the number of keys exceeds the capacity from this operation, evict the least recently used key.
 * The functions get and put must each run in O(1) average time complexity.
 */
public class LRUCache {
    public static void main(String[] args) {
       // LRUCache lruCache = new LRUCache(2);
//        lruCache.put(1, 1); // cache is {1=1}
//        lruCache.put(2, 2); // cache is {1=1, 2=2}
//        System.out.println(lruCache.get(1));    // return 1
//        lruCache.put(3, 3); // evicts key 2, cache is {1=1, 3=3}
//        System.out.println(lruCache.get(2));    // return -1 (not found)
//        lruCache.put(4, 4); // evicts key 1, cache is {4=4, 3=3}
//        System.out.println(lruCache.get(1));    // return -1 (not found)
//        System.out.println(lruCache.get(3));    // return 3
//        System.out.println(lruCache.get(4));    // return 4
    }
//    private final int capacity;
//    private final java.util.Map<Integer, Integer> cache;
}