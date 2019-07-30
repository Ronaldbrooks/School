#include "sequence1.h"
using namespace main_savitch_3;

sequence::sequence( )
{
	used = 0;
	current_index = 0;
}

void sequence::start( )
{
	if (used > 0) current_index = 0;
}
        
void sequence::advance( )
{
	if (current_index == used - 1)
		current_index = used;
	else
		current_index++;
}
        
void sequence::insert(const value_type& entry)
{
	if (is_item())
	{
		for (size_type i = used; i > current_index; i--)
        data[i] = data[i-1];
		used++;
		data[current_index] = entry;
	}
	else
	{
		for (size_type j = used; j > 0; j--)
        data[j] = data[j-1];
		used++;
		current_index = 0;
		data[current_index] = entry;
	}
}
        
void sequence::attach(const value_type& entry)
{
	if (is_item())
	{
		for (size_type i = used; i > current_index + 1; i--)
        data[i] = data[i-1];
		used++;
		current_index++;
		data[current_index] = entry;
	}
	else
	{
		used++;
		current_index = used - 1;
		data[current_index] = entry;
	}
}
        
void sequence::remove_current( )
{
	for (size_type i = current_index; i < used - 1; i++)
		data[i] = data[i+1];
	used--;
}
       
sequence::size_type sequence::size( ) const
{
	return used;
}
        
bool sequence::is_item( ) const
{
	return (current_index != used);
}
        
sequence::value_type sequence::current( ) const
{
	return data[current_index];
}