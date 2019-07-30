cmake_minimum_required(VERSION 3.6)
project(Assignment4)

set(CMAKE_CXX_STANDARD 11)

set(PYTHON_FILES server1.py client1.py polynomials.py)

add_executable(Assignment4 ${PYTHON_FILES})
target_link_libraries(Assignment4 ${PYTHON_LIBRARIES})