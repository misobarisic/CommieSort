#ifndef COMMIESORT_COMMIESORT_H
#define COMMIESORT_COMMIESORT_H
#endif //COMMIESORT_COMMIESORT_H

#include <vector>

/*
namespace commiesort {
    template <class T> std::vector<T> sort(std::vector<T> vec) {
        unsigned int length = vec.size();
        for (unsigned int idx = 0; idx < length; idx++) {
            // this thing needs optimizing - change this if to length-1 in FOR LOOP
            if (idx != length - 1) {
                if (vec[idx] >= vec[idx + 1]) {
                    vec.erase(vec.begin() + idx + 1);
                    return sort(vec);
                }
            }
        }
        return vec;
    }
}
*/

namespace commiesort {
    template<class T>
    std::vector<T> sort(std::vector<T> vec) {
        unsigned int length = vec.size();
        for (unsigned int idx = 0; idx < length - 1; idx++) {
            if (vec[idx] >= vec[idx + 1]) {
                vec.erase(vec.begin() + idx + 1);
                return sort(vec);
            }
        }
        return vec;
    }
}

