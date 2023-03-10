for (int i = 0; i < n; i++)
        {
            // Update Maximum, second maximum and third
            // maximum element
            if (arr[i] > maxA)
            {
                maxC = maxB;
                maxB = maxA;
                maxA = arr[i];
            }
     
            // Update second maximum and third maximum element
            else if (arr[i] > maxB)
            {
                maxC = maxB;
                maxB = arr[i];
            }
     
            // Update third maximum element
            else if (arr[i] > maxC)
                maxC = arr[i];
     
            // Update Minimum and second mimimum element
            if (arr[i] < minA)
            {
                minB = minA;
                minA = arr[i];
            }
     
            // Update second mimimum element
            else if(arr[i] < minB)
                minB = arr[i];
        }
