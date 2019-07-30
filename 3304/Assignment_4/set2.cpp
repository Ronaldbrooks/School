#include <algorithm> // Provides copy function
#include <cassert>   // Provides assert function
#include "set2.h"
#include <iostream>

using namespace std;

namespace main_savitch_3
{
    const set::size_type set::CAPACITY;
    
    set::size_type set::erase(const value_type& target)
    {
	size_type index = 0;
	size_type many_removed = 0;

	while (index < used)
	{
	    if (data[index] == target)
	    {
		--used;
		data[index] = data[used];
		++many_removed;
	    }
	    else
		++index;
	}

	return many_removed;
    }
    
    set::set(const set& entry)
    { 
        capacity = entry.capacity;
        data = new value_type[capacity];
        used=entry.used;
        current_index = entry.current_index;
        copy(entry.data,entry.data+used,data);
    }


    bool set::erase_one(const value_type& target)
    {
	size_type index; // The location of target in the data array    

	// First, set index to the location of target in the data array,
	// which could be as small as 0 or as large as used-1. If target is not
	// in the array, then index will be set equal to used.
	index = 0; 
	while ((index < used) && (data[index] != target))
	    ++index;

	if (index == used)
	    return false; // target isn�t in the bag, so no work to do.

	// When execution reaches here, target is in the bag at data[index].
	// So, reduce used by 1 and copy the last item onto data[index].
	--used;
	data[index] = data[used];    
	return true;
    }

    void set::insert(const value_type& entry)
    // Library facilities used: cassert
    {   
        assert(size( ) < CAPACITY);

        data[used] = entry;
	++used;
    }
    
    
    
    void set::operator +=(const set& addend)
    // Library facilities used: algorithm, cassert
    {
	assert(size( ) + addend.size( ) <= CAPACITY);
	
	copy(addend.data, addend.data + addend.used, data + used);
	used += addend.used;
    }
    
    void set::operator -=(const set& addend)
    // Library facilities used: algorithm, cassert
    {
	assert(size( ) - addend.size( ) <= CAPACITY);
	
	copy(addend.data, addend.data - addend.used, data - used);
	used -= addend.used;
    }


    set::size_type set::count(const value_type& target) const
    {
        size_type answer;
        size_type i;

        answer = 0;
        for (i = 0; i < used; ++i)
            if (target == data[i])
                ++answer;
        return answer;
    }

    set operator +(const set& s1, const set& s2)
    // Library facilities used: cassert
    {
        set answer;

        assert(s1.size( ) + s2.size( ) <= set::CAPACITY);

        answer += s1; 
        answer += s2;
        return answer;
    }
    
    set operator -(const set& s1, const set& s2)
    // Library facilities used: cassert
    {
        set answer;

        assert(s1.size( ) - s2.size( ) <= set::CAPACITY);

        answer -= s1; 
        answer -= s2;
        return answer;
    }
    
    set set::Union(set& s1, set& s2)
    {
        return (s1 + s2);
    }

    set set::intersect(set& s1, set& s2)
    {
        return (s1 - s2);
    }

    set set::complement(const set& s2)
    {
	set answer;
	size_type j = 0;
	
        for (size_type i = 0; i < used; i++)
        {
            while (j < s2.size())
            {
                if (data[i] != s2.data[j])
                {
                    j++;
                    answer.insert(data[i]);
                }
                else 
                    break;
            }
            j = 0;
        }
	
	return answer;
    }

//set::set query()
//set::set display()
//set::set destruct()
//set::set copy_construct()
//set::set overloading()
}